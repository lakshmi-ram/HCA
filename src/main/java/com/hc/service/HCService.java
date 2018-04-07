package com.hc.service;

import org.springframework.stereotype.Component;

import com.hc.dto.AgrgtdIllnessResp;
import com.hc.dto.StateIllnessResp;

@Component
public interface HCService {
	public AgrgtdIllnessResp getDashBoardData();
	public StateIllnessResp getStateChartData(String state);
	public String triggerMail();
}
