package dao;

import java.util.List;

import model.Student;

public interface Idao {
	
	public List<Student> getStudentList();
	
	public Student addStudent(Student student);
	
	public Student editStudent(int id);
	
	public Student DeleteStudent(int id);

}
