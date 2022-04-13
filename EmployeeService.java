package com.example.app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.app.model.Employee;

@Service
@Transactional
public interface EmployeeService {
	 // public Object getAllEmployees;

	List<Employee> getAllEmployees();
	
}

