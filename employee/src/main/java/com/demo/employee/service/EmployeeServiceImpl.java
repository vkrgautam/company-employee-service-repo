package com.demo.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.employee.dao.EmployeeDao;
import com.demo.employee.model.EmployeeDetails;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<EmployeeDetails> getEmployeeDetails(String companyName) {
		return employeeDao.getEmployeeDetails(companyName);
	}

}
