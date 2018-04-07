package com.hc.dto;

import java.util.List;

public class DiseaseSplitResp {
	String diseaseName;
	String percent;
	List<StateMetaData> states;
	public String getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	public String getPercent() {
		return percent;
	}
	public void setPercent(String percent) {
		this.percent = percent;
	}
	public List<StateMetaData> getStates() {
		return states;
	}
	public void setStates(List<StateMetaData> states) {
		this.states = states;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DiseaseSplitResp [diseaseName=");
		builder.append(diseaseName);
		builder.append(", percent=");
		builder.append(percent);
		builder.append(", states=");
		builder.append(states);
		builder.append("]");
		return builder.toString();
	}
	
}
