package com.demo.employee.dao;

import java.util.List;

import com.demo.employee.model.EmployeeDetails;

public interface EmployeeDao {

	List<EmployeeDetails> getEmployeeDetails(String companyName);
}
