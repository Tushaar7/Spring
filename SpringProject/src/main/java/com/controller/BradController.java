package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.BrandDaoImpl;
import com.model.Category;
import com.service.BrandService;

@Controller
public class BradController {

	@Autowired
	BrandService brandService;
	
	@RequestMapping(value="/categories")
	public ModelAndView welcomepage(){
		ModelAndView model = new ModelAndView();
		model.addObject("msg", "Add Category");
		return model;
	}
	
	/*@RequestMapping(value="/saveData")
	public ModelAndView saveData(@ModelAttribute Category category){
		
		if(category.getId()==0){
			brandService.addCategory(category);
		}
		
		brandService.addCategory(category);
		
		return new ModelAndView("/brand");
	}*/
	
	
	@RequestMapping(value="/saveData")
	public ModelAndView saveData(@ModelAttribute("bbm") Category category){
		
		if(category.getId()==0){
			brandService.addCategory(category);
		}
		
		/*brandService.addCategory(category);*/
		
		//List<Category> allcateg =brandService.getAllEmployees();
		
		return new ModelAndView("/brand");
	}

}
