package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.model.Student;

public class StudentDaoImpl implements StudentDao {

	private SessionFactory hibernaSessionFactory;
	
	public void addStudent(Student student) {
		hibernaSessionFactory.openSession().saveOrUpdate(student);
	}

	public List<Student> getAllStudents() {
		
		return null;
	}

	public void deleteStdent(Integer id) {
		
		
	}

	public Student updateStudent(Student student) {
		
		return null;
	}

	public Student getStudent(int id) {
		
		return null;
	}

}
