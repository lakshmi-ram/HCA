package com.hc.service;

import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hc.dto.AgrgtdIllnessResp;
import com.hc.dto.IllnessCountResp;
import com.hc.helper.EmailHelper;

@Component
public class HCPredictiveServiceImpl implements HCPredictiveService {

	@Autowired
	EmailHelper emailHelper;
	
	@Override
	public AgrgtdIllnessResp getRun1Data() {
		AgrgtdIllnessResp agrgtdIllnessResp = new AgrgtdIllnessResp();
		List<IllnessCountResp> illnessCountRespList = new ArrayList<IllnessCountResp>();
		
		IllnessCountResp illnessCountResp = new IllnessCountResp();		
		illnessCountResp.setCount("5");
		illnessCountResp.setId("IN-TN");
		illnessCountResp.setState("Tamil Nadu");
		illnessCountRespList.add(illnessCountResp);
		
		IllnessCountResp illnessCountResp1 = new IllnessCountResp();
		illnessCountResp1.setCount("10");
		illnessCountResp1.setId("IN-KL");
		illnessCountResp1.setState("Kerala");
		illnessCountRespList.add(illnessCountResp1);
				
		agrgtdIllnessResp.setIllnessCountRespList(illnessCountRespList);
	
		try {
			emailHelper.sendMail("prashanth.vp91@gmail.com");
		} catch (MessagingException e) {			
			e.printStackTrace();
		}
		return agrgtdIllnessResp;
	}

	@Override
	public AgrgtdIllnessResp getRun2Data() {
		AgrgtdIllnessResp agrgtdIllnessResp = new AgrgtdIllnessResp();
		List<IllnessCountResp> illnessCountRespList = new ArrayList<IllnessCountResp>();
		
		IllnessCountResp illnessCountResp = new IllnessCountResp();		
		illnessCountResp.setCount("10");
		illnessCountResp.setId("IN-TN");
		illnessCountResp.setState("Tamil Nadu");
		illnessCountRespList.add(illnessCountResp);
		
		IllnessCountResp illnessCountResp1 = new IllnessCountResp();
		illnessCountResp1.setCount("50");
		illnessCountResp1.setId("IN-KL");
		illnessCountResp1.setState("Kerala");
		illnessCountRespList.add(illnessCountResp1);
				
		agrgtdIllnessResp.setIllnessCountRespList(illnessCountRespList);
		try {
			emailHelper.sendMail("harini.sridhar2885@gmail.com");
		} catch (MessagingException e) {			
			e.printStackTrace();
		}
		return agrgtdIllnessResp;
	}

	@Override
	public AgrgtdIllnessResp getPredectiveData() {
		// TODO Auto-generated method stub
		return null;
	}

}
