package com.dao;

import java.util.List;

import com.model.Category;

public interface BrandDao {

	public void addCategory(Category c);
	
	public List<Category> getAllEmployees();
	
}
