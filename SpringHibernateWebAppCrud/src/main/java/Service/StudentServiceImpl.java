package Service;

import org.springframework.beans.factory.annotation.Autowired;

import Dao.StudentDao;
import Model.Student;

public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	
	public boolean add(Student s) {
		return studentDao.add(s) ;
	}

}
