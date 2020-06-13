package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.Idao;
import model.Student;

public class ServiceImpl implements Iservice {

	@Autowired
	Idao iDao;
	
	public List<Student> getStudentList() {
		return iDao.getStudentList() ;
	}

	public Student addStudent(Student student) {
		return iDao.addStudent(student) ;
	}

	public Student editStudent(int id) {
		return iDao.editStudent(id) ;
	}

	public Student DeleteStudent(int id) {
		return iDao.DeleteStudent(id) ;
	}
}
