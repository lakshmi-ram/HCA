package com.hc.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hc.domain.HealthMetrics;
import com.hc.dto.AgrgtdIllnessResp;
import com.hc.dto.DiseaseSplitResp;
import com.hc.dto.IllnessCountResp;
import com.hc.dto.StateIllnessResp;
import com.hc.dto.StateMetaData;
import com.hc.helper.EmailHelper;
import com.hc.repository.HealthMetricsRepo;

@Component
public class HCServiceImpl implements HCService {

	@Autowired
	EmailHelper emailHelper;

	@Autowired
	HealthMetricsRepo healthMetricsRepo;

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
		
		IllnessCountResp illnessCountResp1 = new IllnessCountResp();
		illnessCountResp1.setCount("32000");
		illnessCountResp1.setId("IN-MH");
		illnessCountResp1.setState("Maharashtra");
		illnessCountRespList.add(illnessCountResp1);
		
		IllnessCountResp illnessCountResp2 = new IllnessCountResp();
		illnessCountResp2.setCount("31000");
		illnessCountResp2.setId("IN-BR");
		illnessCountResp2.setState("Bihar");
		illnessCountRespList.add(illnessCountResp2);
		
		IllnessCountResp illnessCountResp3 = new IllnessCountResp();
		illnessCountResp3.setCount("32000");
		illnessCountResp3.setId("IN-WB");
		illnessCountResp3.setState("West Bengal");
		illnessCountRespList.add(illnessCountResp3);
		
		IllnessCountResp illnessCountResp4 = new IllnessCountResp();
		illnessCountResp4.setCount("30000");
		illnessCountResp4.setId("IN-MP");
		illnessCountResp4.setState("Madhya Pradesh");
		illnessCountRespList.add(illnessCountResp4);
		
		IllnessCountResp illnessCountResp5 = new IllnessCountResp();
		illnessCountResp5.setCount("33000");
		illnessCountResp5.setId("IN-TN");
		illnessCountResp5.setState("Tamil Nadu");
		illnessCountRespList.add(illnessCountResp5);
		
		IllnessCountResp illnessCountResp6 = new IllnessCountResp();
		illnessCountResp6.setCount("33000");
		illnessCountResp6.setId("IN-RJ");
		illnessCountResp6.setState("Rajasthan");
		illnessCountRespList.add(illnessCountResp6);
		
		IllnessCountResp illnessCountResp7 = new IllnessCountResp();
		illnessCountResp7.setCount("29000");
		illnessCountResp7.setId("IN-KA");
		illnessCountResp7.setState("Karnataka");
		illnessCountRespList.add(illnessCountResp7);
		
		IllnessCountResp illnessCountResp8 = new IllnessCountResp();
		illnessCountResp8.setCount("34000");
		illnessCountResp8.setId("IN-GJ");
		illnessCountResp8.setState("Gujarat");
		illnessCountRespList.add(illnessCountResp8);
		
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

	@Override
	public List<DiseaseSplitResp> getDiseaseSplitCount() {		
		
		List<DiseaseSplitResp> diseaseSplitRespList= new ArrayList<>();
			DiseaseSplitResp diseaseSplitResp = new DiseaseSplitResp();
			List<StateMetaData> states= new ArrayList<StateMetaData>();
			diseaseSplitResp.setDiseaseName("Dengue");
			diseaseSplitResp.setPercent("55");
			StateMetaData stateMetaData = new StateMetaData();
			stateMetaData.setId("IN-KL");
			stateMetaData.setState("Kerala");
			states.add(stateMetaData);	
			
			StateMetaData stateMetaData1 = new StateMetaData();
			stateMetaData1.setId("IN-JK");
			stateMetaData1.setState("Jammu and Kashmir");
			states.add(stateMetaData1);
			
			StateMetaData stateMetaData2 = new StateMetaData();
			stateMetaData2.setId("IN-TN");
			stateMetaData2.setState("Tamil Nadu");
			states.add(stateMetaData2);
			diseaseSplitResp.setStates(states);
			diseaseSplitRespList.add(diseaseSplitResp);
			//
			DiseaseSplitResp diseaseSplitResp2 = new DiseaseSplitResp();
			List<StateMetaData> states2= new ArrayList<StateMetaData>();
			diseaseSplitResp2.setDiseaseName("Malaria");
			diseaseSplitResp2.setPercent("20");
			StateMetaData stateMetaData3 = new StateMetaData();
			stateMetaData3.setId("IN-KL");
			stateMetaData3.setState("Kerala");
			states2.add(stateMetaData3);	
			
			StateMetaData stateMetaData4 = new StateMetaData();
			stateMetaData4.setId("IN-JK");
			stateMetaData4.setState("Jammu and Kashmir");
			states2.add(stateMetaData4);
			
			StateMetaData stateMetaData5 = new StateMetaData();
			stateMetaData5.setId("IN-TN");
			stateMetaData5.setState("Tamil Nadu");
			states2.add(stateMetaData5);
			diseaseSplitResp2.setStates(states2);
			diseaseSplitRespList.add(diseaseSplitResp2);
			
			DiseaseSplitResp diseaseSplitResp3 = new DiseaseSplitResp();
			List<StateMetaData> states3= new ArrayList<StateMetaData>();
			diseaseSplitResp3.setDiseaseName("Chicken Pox");
			diseaseSplitResp3.setPercent("10");
			StateMetaData stateMetaData6 = new StateMetaData();
			stateMetaData6.setId("IN-MH");
			stateMetaData6.setState("Maharashtra");
			states3.add(stateMetaData6);	
			
			StateMetaData stateMetaData7 = new StateMetaData();
			stateMetaData7.setId("IN-WB");
			stateMetaData7.setState("West Bengal");
			states3.add(stateMetaData7);
			
			StateMetaData stateMetaData8 = new StateMetaData();
			stateMetaData8.setId("IN-TN");
			stateMetaData8.setState("Tamil Nadu");
			states3.add(stateMetaData8);
			diseaseSplitResp3.setStates(states3);
			diseaseSplitRespList.add(diseaseSplitResp3);
			
		return diseaseSplitRespList;
	}

}
