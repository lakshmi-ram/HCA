package com.hc.service;

import org.springframework.stereotype.Component;

import com.hc.dto.IllnessCountResp;

@Component
public interface HCService {
	public IllnessCountResp getDashBoardData();
	public String triggerMail();
}
