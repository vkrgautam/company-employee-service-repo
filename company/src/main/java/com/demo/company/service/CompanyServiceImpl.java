package com.demo.company.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.company.model.EmployeeResponse;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public EmployeeResponse getEmployeeDetails(String companyName) {
		HttpHeaders headers = new HttpHeaders();
		Map<String, String> params = new HashMap<String, String>();
		params.put("companyName", companyName);
		HttpEntity<Object> entity = new HttpEntity<Object>(headers);
		ResponseEntity<EmployeeResponse> response = restTemplate.exchange(
				"http://localhost:9091/employee/details?companyName={companyName}", HttpMethod.GET, entity,
				EmployeeResponse.class, params);
		return response.getBody();
	}

}
