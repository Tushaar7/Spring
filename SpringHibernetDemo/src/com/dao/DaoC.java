package com.dao;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.ModelC;

public class DaoC implements DaoI {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void SaveData(ModelC modelc) {
		// TODO Auto-generated method stub
	 sessionFactory.getCurrentSession().save(modelc);
	
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void delData(ModelC modelc) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(modelc);
	}

	@Override
	public void updata(ModelC modelc) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(modelc);
	}

}
