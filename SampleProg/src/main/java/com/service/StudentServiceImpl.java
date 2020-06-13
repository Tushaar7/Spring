package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.StudentDao;
import com.model.Student;

public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDAO;
	
	public void addStudent(Student student) {
		studentDAO.addStudent(student);	
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
