package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.StudentDao;
import com.model.Student;

public class StudentServiceimpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	
	public Boolean createStudent(Student student) {
		return studentDao.CreateStudent(student);
	}

}
