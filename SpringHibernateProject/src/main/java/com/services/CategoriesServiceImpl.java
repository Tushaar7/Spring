package com.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.CategoriesDao;

public class CategoriesServiceImpl {

    @Autowired
    CategoriesDao categoriesDao;
	
}
