package com.hc.dto;

import java.util.List;

public class AgrgtdIllnessResp {

	List<IllnessCountResp> illnessCountRespList;

	public List<IllnessCountResp> getIllnessCountRespList() {
		return illnessCountRespList;
	}

	public void setIllnessCountRespList(List<IllnessCountResp> illnessCountRespList) {
		this.illnessCountRespList = illnessCountRespList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AgrgtdIllnessResp [illnessCountRespList=");
		builder.append(illnessCountRespList);
		builder.append("]");
		return builder.toString();
	}
	
}
