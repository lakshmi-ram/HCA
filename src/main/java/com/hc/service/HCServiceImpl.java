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
		
		IllnessCountResp illnessCountResp9 = new IllnessCountResp();
		illnessCountResp9.setCount("32000");
		illnessCountResp9.setId("IN-AP");
		illnessCountResp9.setState("Andhra Pradesh");
		illnessCountRespList.add(illnessCountResp9);
		
		IllnessCountResp illnessCountResp0 = new IllnessCountResp();
		illnessCountResp0.setCount("33000");
		illnessCountResp0.setId("IN-OR");
		illnessCountResp0.setState("Orissa");
		illnessCountRespList.add(illnessCountResp0);
		
		IllnessCountResp illnessCountResp10 = new IllnessCountResp();
		illnessCountResp10.setCount("33000");
		illnessCountResp10.setId("IN-OR");
		illnessCountResp10.setState("Orissa");
		illnessCountRespList.add(illnessCountResp10);
		
		IllnessCountResp illnessCountResp11 = new IllnessCountResp();
		illnessCountResp11.setCount("33000");
		illnessCountResp11.setId("IN-TG");
		illnessCountResp11.setState("Telangana");
		illnessCountRespList.add(illnessCountResp11);
		
		IllnessCountResp illnessCountResp12 = new IllnessCountResp();
		illnessCountResp12.setCount("31000");
		illnessCountResp12.setId("IN-KL");
		illnessCountResp12.setState("Kerala");
		illnessCountRespList.add(illnessCountResp12);
		
		IllnessCountResp illnessCountResp13 = new IllnessCountResp();
		illnessCountResp13.setCount("29000");
		illnessCountResp13.setId("IN-JH");
		illnessCountResp13.setState("Jharkhand");
		illnessCountRespList.add(illnessCountResp13);
		
		IllnessCountResp illnessCountResp14 = new IllnessCountResp();
		illnessCountResp14.setCount("33000");
		illnessCountResp14.setId("IN-OR");
		illnessCountResp14.setState("Jharkhand");
		illnessCountRespList.add(illnessCountResp14);
		
		IllnessCountResp illnessCountResp15 = new IllnessCountResp();
		illnessCountResp15.setCount("28000");
		illnessCountResp15.setId("IN-AS");
		illnessCountResp15.setState("Assam");
		illnessCountRespList.add(illnessCountResp15);
		
		IllnessCountResp illnessCountResp16 = new IllnessCountResp();
		illnessCountResp16.setCount("30000");
		illnessCountResp16.setId("IN-PB");
		illnessCountResp16.setState("Punjab");
		illnessCountRespList.add(illnessCountResp16);
		
		IllnessCountResp illnessCountResp17 = new IllnessCountResp();
		illnessCountResp17.setCount("33000");
		illnessCountResp17.setId("IN-CT");
		illnessCountResp17.setState("Chhattisgarh");
		illnessCountRespList.add(illnessCountResp17);
		
		IllnessCountResp illnessCountResp18 = new IllnessCountResp();
		illnessCountResp18.setCount("30000");
		illnessCountResp18.setId("IN-HR");
		illnessCountResp18.setState("Haryana");
		illnessCountRespList.add(illnessCountResp18);
		
		IllnessCountResp illnessCountResp19 = new IllnessCountResp();
		illnessCountResp19.setCount("20000");
		illnessCountResp19.setId("IN-JK");
		illnessCountResp19.setState("Jammu and Kashmir");
		illnessCountRespList.add(illnessCountResp19);
		
		IllnessCountResp illnessCountResp20 = new IllnessCountResp();
		illnessCountResp20.setCount("28000");
		illnessCountResp20.setId("IN-UT");
		illnessCountResp20.setState("Uttarakhand");
		illnessCountRespList.add(illnessCountResp20);
		
		IllnessCountResp illnessCountResp21 = new IllnessCountResp();
		illnessCountResp21.setCount("17000");
		illnessCountResp21.setId("IN-HP");
		illnessCountResp21.setState("Himachal Pradesh");
		illnessCountRespList.add(illnessCountResp21);
		
		IllnessCountResp illnessCountResp22 = new IllnessCountResp();
		illnessCountResp22.setCount("31000");
		illnessCountResp22.setId("IN-TR");
		illnessCountResp22.setState("Tripura");
		illnessCountRespList.add(illnessCountResp22);
		
		IllnessCountResp illnessCountResp23 = new IllnessCountResp();
		illnessCountResp23.setCount("31000");
		illnessCountResp23.setId("IN-TR");
		illnessCountResp23.setState("Tripura");
		illnessCountRespList.add(illnessCountResp23);
		
		IllnessCountResp illnessCountResp24 = new IllnessCountResp();
		illnessCountResp24.setCount("21000");
		illnessCountResp24.setId("IN-ML");
		illnessCountResp24.setState("Meghalaya");
		illnessCountRespList.add(illnessCountResp24);
		
		IllnessCountResp illnessCountResp25 = new IllnessCountResp();
		illnessCountResp25.setCount("22000");
		illnessCountResp25.setId("IN-MN");
		illnessCountResp25.setState("Manipur");
		illnessCountRespList.add(illnessCountResp25);
		
		IllnessCountResp illnessCountResp26 = new IllnessCountResp();
		illnessCountResp26.setCount("22000");
		illnessCountResp26.setId("IN-NL");
		illnessCountResp26.setState("Nagaland");
		illnessCountRespList.add(illnessCountResp26);
		
		IllnessCountResp illnessCountResp27 = new IllnessCountResp();
		illnessCountResp27.setCount("32000");
		illnessCountResp27.setId("IN-GA");
		illnessCountResp27.setState("Goa");
		illnessCountRespList.add(illnessCountResp27);
		
		IllnessCountResp illnessCountResp28 = new IllnessCountResp();
		illnessCountResp28.setCount("33000");
		illnessCountResp28.setId("IN-AR");
		illnessCountResp28.setState("Arunachal Pradesh");
		illnessCountRespList.add(illnessCountResp28);
		
		IllnessCountResp illnessCountResp29 = new IllnessCountResp();
		illnessCountResp29.setCount("23000");
		illnessCountResp29.setId("IN-MZ");
		illnessCountResp29.setState("Mizoram");
		illnessCountRespList.add(illnessCountResp29);
		
		IllnessCountResp illnessCountResp30 = new IllnessCountResp();
		illnessCountResp30.setCount("24000");
		illnessCountResp30.setId("IN-SK");
		illnessCountResp30.setState("Sikkim");
		illnessCountRespList.add(illnessCountResp30);
		
		IllnessCountResp illnessCountResp31 = new IllnessCountResp();
		illnessCountResp31.setCount("31000");
		illnessCountResp31.setId("IN-DL");
		illnessCountResp31.setState("Delhi");
		illnessCountRespList.add(illnessCountResp31);
		
		IllnessCountResp illnessCountResp32 = new IllnessCountResp();
		illnessCountResp32.setCount("33000");
		illnessCountResp32.setId("IN-PY");
		illnessCountResp32.setState("Puducherry");
		illnessCountRespList.add(illnessCountResp32);
		
		IllnessCountResp illnessCountResp33 = new IllnessCountResp();
		illnessCountResp33.setCount("30000");
		illnessCountResp33.setId("IN-CH");
		illnessCountResp33.setState("Chandigarh");
		illnessCountRespList.add(illnessCountResp33);
		
		IllnessCountResp illnessCountResp34 = new IllnessCountResp();
		illnessCountResp34.setCount("30000");
		illnessCountResp34.setId("IN-AN");
		illnessCountResp34.setState("Andaman and Nicobar Islands");
		illnessCountRespList.add(illnessCountResp34);
		
		IllnessCountResp illnessCountResp35 = new IllnessCountResp();
		illnessCountResp35.setCount("30000");
		illnessCountResp35.setId("IN-DN");
		illnessCountResp35.setState("Dadra and Nagar Haveli");
		illnessCountRespList.add(illnessCountResp35);
		
		IllnessCountResp illnessCountResp36 = new IllnessCountResp();
		illnessCountResp36.setCount("29000");
		illnessCountResp36.setId("IN-DD");
		illnessCountResp36.setState("Daman and Diu");
		illnessCountRespList.add(illnessCountResp36);
		
		IllnessCountResp illnessCountResp37 = new IllnessCountResp();
		illnessCountResp37.setCount("31000");
		illnessCountResp37.setId("IN-LD");
		illnessCountResp37.setState("Lakshadweep");
		illnessCountRespList.add(illnessCountResp37);
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
			stateMetaData3.setId("IN-BR");
			stateMetaData3.setState("Bihar");
			states2.add(stateMetaData3);	
			
			StateMetaData stateMetaData4 = new StateMetaData();
			stateMetaData4.setId("IN-KA");
			stateMetaData4.setState("Karnataka");
			states2.add(stateMetaData4);
			
			StateMetaData stateMetaData5 = new StateMetaData();
			stateMetaData5.setId("IN-TG");
			stateMetaData5.setState("Telangana");
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
