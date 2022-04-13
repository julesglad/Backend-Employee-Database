package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.Employee;
import com.example.app.service.EmployeeService;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping
	public List<Employee> getAllEmployees(){
			return employeeService.getAllEmployees();
	}
	

	
}
