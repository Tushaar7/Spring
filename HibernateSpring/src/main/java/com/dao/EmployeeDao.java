package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDao {

	public void addEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployee(Integer employeeId);
	
	public Employee getEmployee(int empid);	
	
}
