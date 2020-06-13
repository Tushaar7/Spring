package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee updateEmployee(Employee employee);
	
	 public void deleteEmployee(Integer employeeId);

	 public Employee getEmployee(int empid);
}
