package com.hc.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hc.domain.HealthMetrics;
import com.hc.dto.AgrgtdIllnessResp;
import com.hc.dto.IllnessCountResp;
import com.hc.dto.StateIllnessResp;
import com.hc.helper.EmailHelper;
import com.hc.repository.HealthMetricsRepo;

@Component
public class HCServiceImpl implements HCService {

	@Autowired
	EmailHelper emailHelper;

	@Autowired
	HealthMetricsRepo healthMetricsRepo;
	
	public String triggerMail() {
		try {
			emailHelper.sendMail();
			return "pwdresetsuccess";
		} catch (Exception e) {
			return "error";
		}
	}

	public AgrgtdIllnessResp getDashBoardData() {		
		List<HealthMetrics> healthMetrics = (List<HealthMetrics>) healthMetricsRepo.findAll();
		int size = healthMetrics.size();
		AgrgtdIllnessResp agrgtdIllnessResp = new AgrgtdIllnessResp();
		List<IllnessCountResp> illnessCountRespList = new ArrayList<IllnessCountResp>();
		IllnessCountResp illnessCountResp = new IllnessCountResp();
		
		illnessCountResp.setCount("33000");
		illnessCountResp.setId("IN-UP");
		illnessCountResp.setState("Uttar Pradesh");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("32000");
		illnessCountResp.setId("IN-MH");
		illnessCountResp.setState("Maharashtra");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("31000");
		illnessCountResp.setId("IN-BR");
		illnessCountResp.setState("Bihar");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("32000");
		illnessCountResp.setId("IN-WB");
		illnessCountResp.setState("West Bengal");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("30000");
		illnessCountResp.setId("IN-MP");
		illnessCountResp.setState("Madhya Pradesh");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("33000");
		illnessCountResp.setId("IN-TN");
		illnessCountResp.setState("Tamil Nadu");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("33000");
		illnessCountResp.setId("IN-RJ");
		illnessCountResp.setState("Rajasthan");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("29000");
		illnessCountResp.setId("IN-KA");
		illnessCountResp.setState("Karnataka");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("34000");
		illnessCountResp.setId("IN-GJ");
		illnessCountResp.setState("Gujarat");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("32000");
		illnessCountResp.setId("IN-AP");
		illnessCountResp.setState("Andhra Pradesh");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("33000");
		illnessCountResp.setId("IN-OR");
		illnessCountResp.setState("Orissa");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("33000");
		illnessCountResp.setId("IN-OR");
		illnessCountResp.setState("Orissa");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("33000");
		illnessCountResp.setId("IN-TG");
		illnessCountResp.setState("Telangana");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("31000");
		illnessCountResp.setId("IN-KL");
		illnessCountResp.setState("Kerala");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("29000");
		illnessCountResp.setId("IN-JH");
		illnessCountResp.setState("Jharkhand");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("33000");
		illnessCountResp.setId("IN-OR");
		illnessCountResp.setState("Jharkhand");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("28000");
		illnessCountResp.setId("IN-AS");
		illnessCountResp.setState("Assam");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("30000");
		illnessCountResp.setId("IN-PB");
		illnessCountResp.setState("Punjab");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("33000");
		illnessCountResp.setId("IN-CT");
		illnessCountResp.setState("Chhattisgarh");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("30000");
		illnessCountResp.setId("IN-HR");
		illnessCountResp.setState("Haryana");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("20000");
		illnessCountResp.setId("IN-JK");
		illnessCountResp.setState("Jammu and Kashmir");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("28000");
		illnessCountResp.setId("IN-UT");
		illnessCountResp.setState("Uttarakhand");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("17000");
		illnessCountResp.setId("IN-HP");
		illnessCountResp.setState("Himachal Pradesh");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("31000");
		illnessCountResp.setId("IN-TR");
		illnessCountResp.setState("Tripura");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("31000");
		illnessCountResp.setId("IN-TR");
		illnessCountResp.setState("Tripura");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("21000");
		illnessCountResp.setId("IN-ML");
		illnessCountResp.setState("Meghalaya");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("22000");
		illnessCountResp.setId("IN-MN");
		illnessCountResp.setState("Manipur");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("22000");
		illnessCountResp.setId("IN-NL");
		illnessCountResp.setState("Nagaland");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("32000");
		illnessCountResp.setId("IN-GA");
		illnessCountResp.setState("Goa");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("33000");
		illnessCountResp.setId("IN-AR");
		illnessCountResp.setState("Arunachal Pradesh");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("23000");
		illnessCountResp.setId("IN-MZ");
		illnessCountResp.setState("Mizoram");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("24000");
		illnessCountResp.setId("IN-SK");
		illnessCountResp.setState("Sikkim");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("31000");
		illnessCountResp.setId("IN-DL");
		illnessCountResp.setState("Delhi");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("33000");
		illnessCountResp.setId("IN-PY");
		illnessCountResp.setState("Puducherry");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("30000");
		illnessCountResp.setId("IN-CH");
		illnessCountResp.setState("Chandigarh");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("30000");
		illnessCountResp.setId("IN-AN");
		illnessCountResp.setState("Andaman and Nicobar Islands");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("30000");
		illnessCountResp.setId("IN-DN");
		illnessCountResp.setState("Dadra and Nagar Haveli");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("29000");
		illnessCountResp.setId("IN-DD");
		illnessCountResp.setState("Daman and Diu");
		illnessCountRespList.add(illnessCountResp);
		
		illnessCountResp.setCount("31000");
		illnessCountResp.setId("IN-LD");
		illnessCountResp.setState("Lakshadweep");
		illnessCountRespList.add(illnessCountResp);
		agrgtdIllnessResp.setIllnessCountRespList(illnessCountRespList);
		return agrgtdIllnessResp;
	}

	@Override
	public StateIllnessResp getStateChartData(String state) {
		StateIllnessResp stateIllnessResp = new StateIllnessResp();
		stateIllnessResp.setState(state);
		Map<String, String> diseaseMap = new HashMap<String, String>();
		if(state.equalsIgnoreCase("IN-TN")) { //33000
			diseaseMap.put("Dengue", "16500"); //50
			diseaseMap.put("Malaria", "9900"); //30
			diseaseMap.put("Chicken Pox","6600"); //20 			
		}else if(state.equalsIgnoreCase("IN-KL")) { //31000
			diseaseMap.put("Dengue", "9300"); //30
			diseaseMap.put("Malaria", "12400"); //40
			diseaseMap.put("Chicken Pox", "9300"); //30
		}else if(state.equalsIgnoreCase("IN-JK")) { //20000
			diseaseMap.put("Dengue", "6000"); //30
			diseaseMap.put("Malaria", "10000"); //50
			diseaseMap.put("Chicken Pox", "4000"); //20
		}else {
			diseaseMap.put("Dengue", "10000"); //30
			diseaseMap.put("Malaria", "10000"); //50
			diseaseMap.put("Chicken Pox", "10000"); //20
		}
		stateIllnessResp.setDiseaseMap(diseaseMap);
		return stateIllnessResp;
	}

}
