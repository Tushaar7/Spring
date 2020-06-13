package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BrandDao;
import com.model.Category;

@Service
@Transactional
public class BrandServiceImpl implements BrandService {

	@Autowired
	BrandDao brandDao;
	
	@Transactional
	public void addCategory(Category category) {
		brandDao.addCategory(category);
	}

	@Override
	public List<Category> getAllEmployees() {
		return brandDao.getAllEmployees();
	}
}
