package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Category;

@Repository
public class BrandDaoImpl implements BrandDao {

	@Autowired
	private SessionFactory hiberSessionFactory;
	
	public void addCategory(Category category) {
		
		try {
			Session session = hiberSessionFactory.openSession();
			session.saveOrUpdate(category);
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		/*hiberSessionFactory.openSession().saveOrUpdate(category);*/
	}

	@Override
	public List<Category> getAllEmployees() {

		return hiberSessionFactory.openSession()
				.createQuery("from category1").list();

	}
}
