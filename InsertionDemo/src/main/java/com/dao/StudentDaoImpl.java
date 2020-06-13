package com.dao;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Student;

public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory hibernatesessionfactory;
	
	public Boolean CreateStudent(Student student) {
		
		Session session = hibernatesessionfactory.openSession();
		session.save(student);
		session.beginTransaction().commit();
		return session.beginTransaction().wasCommitted();
	}
}
