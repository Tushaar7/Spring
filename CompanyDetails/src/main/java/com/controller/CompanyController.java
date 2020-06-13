package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Company;
import com.service.CompanyService;

@Controller
public class CompanyController {

	@Autowired
	CompanyService companyservice;
	
	@RequestMapping("/home")
	public ModelAndView listCompany(ModelAndView model){
		
		return model;
	}
	
	@RequestMapping(value="/newCompany")
	public ModelAndView newContact(ModelAndView model){
		Company company = new Company();
		model.addObject("company",company);
		model.setViewName("CompanyForm");
		return model;
	}
	
	@RequestMapping(value="/saveCompany")
	public ModelAndView saveCompany(@ModelAttribute Company company){
		if(company.getId() == 0){
			companyservice.addComapny(company);
		}
		return new ModelAndView("/home");
	}
	
	
}
