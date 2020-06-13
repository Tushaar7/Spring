package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {
	
	public void addStudent(Student student);

	public List<Student> getAllStudents();
	
	public void deleteStdent(Integer id);
	
	public Student updateStudent(Student student);
	
	public Student getStudent(int id);

}
