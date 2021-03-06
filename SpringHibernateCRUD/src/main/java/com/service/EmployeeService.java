package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {

	public boolean addEmployee(Employee employee);
	public List<Employee>getAllEmployees();
	public void deleteEmployee(Integer employeeId);
	public Employee getEmployee(int employeeId);
	public Employee updateEmployee(Employee employee);
}
