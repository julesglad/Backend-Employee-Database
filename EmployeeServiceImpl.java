 package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.app.model.Employee;
import com.example.app.repository.EmployeeRepository;

@Repository
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository EmployeeRepository;
	
		public List<Employee> getAllEmployees() {
			return (List<Employee>) EmployeeRepository.findAll();
		}

}
