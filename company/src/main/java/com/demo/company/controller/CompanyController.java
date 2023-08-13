package com.demo.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.company.model.EmployeeResponse;
import com.demo.company.service.CompanyService;

@RestController
@RequestMapping("company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@GetMapping("details")
	public EmployeeResponse getEmployees(@RequestParam String companyName) {
		return companyService.getEmployeeDetails(companyName);
	}

}
