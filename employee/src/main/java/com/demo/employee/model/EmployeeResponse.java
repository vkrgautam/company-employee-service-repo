package com.demo.employee.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeResponse {

	private List<EmployeeDetails> employees;

}
