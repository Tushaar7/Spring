package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import Model.Student;

public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory sf;
	
	public boolean add(Student s) {
		Session session = sf.openSession();
		session.save(s);
		session.beginTransaction().commit();
		return session.beginTransaction().wasCommitted();
	}

}
