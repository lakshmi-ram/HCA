package com.hc.controller;

import java.io.FileInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hc.domain.HealthMetrics;
import com.hc.dto.AgrgtdIllnessResp;
import com.hc.dto.StateIllnessResp;
import com.hc.repository.HealthMetricsRepo;
import com.hc.service.HCService;

@RestController
public class HCRestController {
	
	@Autowired
	HCService hcService;

	@Autowired
	HealthMetricsRepo healthMetricsRepo;
	
	@RequestMapping(value = "/aggregated-illness-count", method = RequestMethod.GET)
	public ResponseEntity<AgrgtdIllnessResp> totalIllnessCount(HttpServletRequest req, HttpServletResponse res) {		
		AgrgtdIllnessResp agrgtdIllnessResp = null;
		try {
			agrgtdIllnessResp = hcService.getDashBoardData();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<AgrgtdIllnessResp>(agrgtdIllnessResp, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/state-illness-count", method = RequestMethod.POST)
	public ResponseEntity<StateIllnessResp> stateIllnessCount(HttpServletRequest req, HttpServletResponse res, @RequestBody String state) {		
		StateIllnessResp stateIllnessResp = null;
		try {
			stateIllnessResp = hcService.getStateChartData(state);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<StateIllnessResp>(stateIllnessResp, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/process-excel", method = RequestMethod.POST)
	public String processExcel(String fileName){
		try {
			int i = 3;
			fileName = "DataStructure.xlsx";
			/** Creating Input Stream**/  
		    FileInputStream myInput = new FileInputStream(fileName);  
		   /** Create a POIFSFileSystem object**/  
		   //POIFSFileSystem myFileSystem = new POIFSFileSystem(myInput);  
		   /** Create a workbook using the File System**/  
		   XSSFWorkbook myWorkBook = new XSSFWorkbook(myInput);  
		    /** Get the first sheet from workbook**/  
		   XSSFSheet mySheet = myWorkBook.getSheetAt(0);
		   /** We now need something to iterate through the cells.**/  	   
			// Reads the data in excel file until last row is encountered
			while (i <= mySheet.getLastRowNum()) {
				// Creates an object for the UserInfo Model
				HealthMetrics healthMetric = new HealthMetrics();
				// Creates an object representing a single row in excel
				XSSFRow row = mySheet.getRow(i++);
				// Sets the Read data to the model class				
				healthMetric.setHospitalName(row.getCell(0).toString());
				healthMetric.setTimeStamp(row.getCell(1).toString());
				healthMetric.setAadhar(row.getCell(2).toString());
				healthMetric.setGender(row.getCell(3).toString());
				healthMetric.setAge(row.getCell(4).toString());
				healthMetric.setIllness(row.getCell(5).toString());
				healthMetric.setState(row.getCell(6).toString());
				healthMetric.setLatLong(row.getCell(7).toString());				
				// persist data into database in here
				healthMetricsRepo.save(healthMetric);
			}								
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "hello";	
	}
}
