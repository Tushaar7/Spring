package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.EmployeeDao;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}

	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	public Employee updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}

	public void deleteEmployee(Integer employeeId) {
		employeeDao.deleteEmployee(employeeId);
		
	}

	public Employee getEmployee(int empid) {
		return employeeDao.getEmployee(empid);
	}
}
