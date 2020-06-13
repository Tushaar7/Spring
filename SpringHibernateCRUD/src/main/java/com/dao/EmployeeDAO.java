package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDAO {
	
	public boolean addEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void deleteEmployee(Integer employeeId);
	public Employee updateEmployee(Employee employee);
	public Employee getEmployee(int employeeid);

}
