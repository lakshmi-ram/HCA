package com.hc.controller;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hc.domain.HealthMetrics;
import com.hc.dto.IllnessCountResp;
import com.hc.repository.HealthMetricsRepo;
import com.hc.service.HCService;

@RestController
public class HCRestController {
	
	@Autowired
	HCService hcService;

	@Autowired
	HealthMetricsRepo healthMetricsRepo;
	
	@RequestMapping(value = "/aggregated-illness-count", method = RequestMethod.GET)
	public ResponseEntity<IllnessCountResp> totalIllnessCount(HttpServletRequest req, HttpServletResponse res) {		
		IllnessCountResp illnessCountResp = null;
		try {
			illnessCountResp = hcService.getDashBoardData();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<IllnessCountResp>(illnessCountResp, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/process-excel", method = RequestMethod.POST)
	public String processExcel(String fileName){
		try {
			int i = 0;
			fileName = "";
			/** Creating Input Stream**/  
		    FileInputStream myInput = new FileInputStream(fileName);  
		   /** Create a POIFSFileSystem object**/  
		   POIFSFileSystem myFileSystem = new POIFSFileSystem(myInput);  
		   /** Create a workbook using the File System**/  
		   HSSFWorkbook myWorkBook = new HSSFWorkbook(myFileSystem);  
		    /** Get the first sheet from workbook**/  
		   HSSFSheet mySheet = myWorkBook.getSheetAt(0);
		   /** We now need something to iterate through the cells.**/  	   
			// Reads the data in excel file until last row is encountered
			while (i <= mySheet.getLastRowNum()) {
				// Creates an object for the UserInfo Model
				HealthMetrics healthMetric = new HealthMetrics();
				// Creates an object representing a single row in excel
				HSSFRow row = mySheet.getRow(i++);
				// Sets the Read data to the model class				
				healthMetric.setHospitalName(row.getCell(1).getStringCellValue());
				healthMetric.setTimeStamp(row.getCell(2).getStringCellValue());
				healthMetric.setAadhar(row.getCell(3).getStringCellValue());
				healthMetric.setGender(row.getCell(4).getStringCellValue());
				healthMetric.setAge(row.getCell(5).getStringCellValue());
				healthMetric.setIllness(row.getCell(6).getStringCellValue());
				healthMetric.setState(row.getCell(7).getStringCellValue());
				healthMetric.setLatLong(row.getCell(8).getStringCellValue());				
				// persist data into database in here
				healthMetricsRepo.save(healthMetric);
			}								
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "hello";	
	}
}
