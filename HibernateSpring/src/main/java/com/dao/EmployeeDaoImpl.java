package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory hibernateSesionFactory;
	
	public void addEmployee(Employee employee) {
		hibernateSesionFactory.openSession().saveOrUpdate(employee);
	}

	public List<Employee> getAllEmployees() {
		return hibernateSesionFactory.openSession().createQuery("from Employee").list();
	}

	public Employee updateEmployee(Employee employee) {
		hibernateSesionFactory.openSession().update(employee);
		return employee;
	}

	public void deleteEmployee(Integer employeeId) {
		Session session = hibernateSesionFactory.openSession();
		int result = session.createQuery("delete from Employee where id= "+employeeId).executeUpdate();
			
		if(result > 0){
			System.out.println("Removed...");
		}else{
			System.out.println("Failed...");
		}	
	}

	public Employee getEmployee(int empid) {
		return (Employee)hibernateSesionFactory.openSession().get(Employee.class,empid);
	}
}
