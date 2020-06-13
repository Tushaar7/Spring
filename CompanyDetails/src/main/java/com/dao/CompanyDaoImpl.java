package com.dao;

import org.hibernate.SessionFactory;

import com.model.Company;

public class CompanyDaoImpl implements CompanyDao {

	private SessionFactory hibernateSessionFactory;
	
	public void addComapny(Company company) {
		hibernateSessionFactory.openSession().saveOrUpdate(company);
	}

}
