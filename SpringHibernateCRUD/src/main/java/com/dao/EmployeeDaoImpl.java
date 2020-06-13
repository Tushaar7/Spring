package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public boolean addEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		session.saveOrUpdate(employee);
		session.beginTransaction().commit();
		return session.beginTransaction().wasCommitted();
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {
		return sessionFactory.openSession().createQuery("from employee").list();
	}

	public void deleteEmployee(Integer employeeId) {
		Employee employee = (Employee) sessionFactory.openSession().load(
				Employee.class, employeeId);

		if (null != employee) {
			this.sessionFactory.openSession().delete(employee);
		}

	}

	public Employee getEmployee(int empid) {
		return (Employee) sessionFactory.openSession().get(Employee.class,
				empid);
	}

	public Employee updateEmployee(Employee employee) {
		sessionFactory.openSession().update(employee);
		return employee;
	}
}
