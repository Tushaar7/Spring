package service;

import java.util.List;

import model.Student;

public interface Iservice {
	
	public List<Student> getStudentList();

	 
	public Student addStudent(Student student);

	public Student editStudent(int id);

	public Student DeleteStudent(int id);

}
