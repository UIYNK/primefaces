package ynk.java.service;

import ynk.java.model.Employee;

import java.util.List;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	
}
