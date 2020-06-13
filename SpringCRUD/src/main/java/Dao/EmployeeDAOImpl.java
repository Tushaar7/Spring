package Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory hibernateSessionFactory;

	public void addEmployee(Employee employee) {
		hibernateSessionFactory.openSession().saveOrUpdate(employee);

	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {

		return hibernateSessionFactory.openSession()
				.createQuery("from Employee").list();
	}

	// @Override
	public void deleteEmployee(Integer employeeId) {
		
		Session session = hibernateSessionFactory.openSession();
		int result = session.createQuery("delete from Employee where id="+employeeId).executeUpdate();
		
		if(result > 0){
			System.out.println("removed");
		}else{
			System.out.println("failed");
		}
	}
		
		
		/*Employee employee = (Employee) hibernateSessionFactory.openSession()
				.load(Employee.class, employeeId);
		if (null != employee) {
			this.hibernateSessionFactory.getCurrentSession().delete(employee);
		}
	}
*/		
		
	public Employee getEmployee(int empid) {
		return (Employee) hibernateSessionFactory.openSession().get(
				Employee.class, empid);
	}

	// @Override
	public Employee updateEmployee(Employee employee) {
		hibernateSessionFactory.openSession().update(employee);
		return employee;
	}

}
