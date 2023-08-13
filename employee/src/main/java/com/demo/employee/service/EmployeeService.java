package com.demo.employee.service;

import java.util.List;

import com.demo.employee.model.EmployeeDetails;

public interface EmployeeService {

	List<EmployeeDetails> getEmployeeDetails(String companyName);
}
