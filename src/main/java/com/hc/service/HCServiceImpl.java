package com.hc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hc.domain.HealthMetrics;
import com.hc.dto.IllnessCountResp;
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

	public IllnessCountResp getDashBoardData() {
		IllnessCountResp illnessCountResp =  new IllnessCountResp();
		List<HealthMetrics> healthMetrics = (List<HealthMetrics>) healthMetricsRepo.findAll();
		int size = healthMetrics.size();
		return illnessCountResp;
	}

}
