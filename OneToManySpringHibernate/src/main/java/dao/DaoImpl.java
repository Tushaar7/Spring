package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import model.Student;

public class DaoImpl implements Idao {

	@Autowired
	SessionFactory hibernateSessionFactory;
	
	public List<Student> getStudentList() {
		
		Session session = hibernateSessionFactory.openSession();
		
		List<Student> lst = session.createCriteria(Student.class).list();
		
		return lst;
	}

	public Student addStudent(Student student) {
		Session session = hibernateSessionFactory.openSession();
		session.saveOrUpdate(student);
		session.beginTransaction().commit();
		return student;
	}

	public Student editStudent(int id) {
		Session session = hibernateSessionFactory.openSession();
		Student student = (Student)session.load(Student.class, id);
		session.beginTransaction().commit();
		return student;
	}

	public Student DeleteStudent(int id) {
		Session session = hibernateSessionFactory.openSession();
		Student student = (Student)session.load(Student.class, id);
		session.delete(student);
		session.beginTransaction().commit();
		session.flush();
		return student;
	}

}
