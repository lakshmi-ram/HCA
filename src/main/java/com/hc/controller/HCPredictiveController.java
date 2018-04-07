package com.hc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hc.dto.AgrgtdIllnessResp;
import com.hc.service.HCPredictiveService;

@RestController
public class HCPredictiveController {
	
	@Autowired
	HCPredictiveService hcService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/run1", method = RequestMethod.GET)
	public ResponseEntity<AgrgtdIllnessResp> getRun1Data(HttpServletRequest req, HttpServletResponse res) {		
		AgrgtdIllnessResp agrgtdIllnessResp = null;
		try {
			agrgtdIllnessResp = hcService.getRun1Data();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<AgrgtdIllnessResp>(agrgtdIllnessResp, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/run2", method = RequestMethod.GET)
	public ResponseEntity<AgrgtdIllnessResp> getRun2Data(HttpServletRequest req, HttpServletResponse res) {		
		AgrgtdIllnessResp stateIllnessResp = null;
		try {
			stateIllnessResp = hcService.getRun2Data();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<AgrgtdIllnessResp>(stateIllnessResp, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/predict", method = RequestMethod.GET)
	public ResponseEntity<AgrgtdIllnessResp> getPredectiveData(HttpServletRequest req, HttpServletResponse res) {		
		AgrgtdIllnessResp stateIllnessResp = null;
		try {
			stateIllnessResp = hcService.getPredectiveData();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<AgrgtdIllnessResp>(stateIllnessResp, HttpStatus.OK);
	}
		
}
