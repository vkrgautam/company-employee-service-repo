package com.demo.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.employee.model.EmployeeDetails;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeDetails> getEmployeeDetails(String companyName) {
		return employeeRepository.findByCompanyName(companyName);
	}

}
