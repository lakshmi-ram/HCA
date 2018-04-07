package com.hc.dto;

import java.util.Map;

public class StateIllnessResp {

	String state;
	Map<String, String> diseaseMap;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Map<String, String> getDiseaseMap() {
		return diseaseMap;
	}
	public void setDiseaseMap(Map<String, String> diseaseMap) {
		this.diseaseMap = diseaseMap;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StateIllnessResp [state=");
		builder.append(state);
		builder.append(", diseaseMap=");
		builder.append(diseaseMap);
		builder.append("]");
		return builder.toString();
	}	
}
