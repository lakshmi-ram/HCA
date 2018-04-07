package com.hc.service;

import org.springframework.stereotype.Component;

import com.hc.dto.AgrgtdIllnessResp;

@Component
public interface HCPredictiveService {
	public AgrgtdIllnessResp getRun1Data();
	public AgrgtdIllnessResp getRun2Data();
	public AgrgtdIllnessResp getPredectiveData();
}
