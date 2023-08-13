package com.demo.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.employee.model.EmployeeResponse;
import com.demo.employee.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("details")
	public EmployeeResponse getEmployees(@RequestParam String companyName) {
		EmployeeResponse response = new EmployeeResponse();
		response.setEmployees(employeeService.getEmployeeDetails(companyName));
		return response;
	}
}
