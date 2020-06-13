package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.CompanyDao;
import com.model.Company;

public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyDao companydao;
	
	public void addComapny(Company company) {
		companydao.addComapny(company);
	}

	
	
}
