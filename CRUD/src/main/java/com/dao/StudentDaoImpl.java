package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory session;
	
	public void add(Student student) {
		session.getCurrentSession().save(student);
	}

	public void edit(Student student) {
		session.getCurrentSession().update(student);
	}

	public void delete(int studentId) {
		session.getCurrentSession().delete(getStudent(studentId));
		
	}

	public Student getStudent(int studentId) {
		
		return (Student)session.getCurrentSession().get(Student.class, studentId) ;
	}

	public List getAllStudent() {
		
		return session.getCurrentSession().createQuery("from Student").list() ;
	}

}
