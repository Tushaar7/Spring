package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Categories;
import com.services.CategoriesService;

@Controller
public class CategoriesController {

	@Autowired
	CategoriesService categoriesService;
	
	@RequestMapping(value="/home")
	public ModelAndView gohome(ModelAndView model){
		Categories categories = new Categories();
		//model.addObject("categories", categories);
		model.setViewName("home");
		return model;
	}
	
	
/*	
	@Controller
	public class EmployeeController {

		@Autowired
		EmployeeService employeeService;

		@RequestMapping(value = "/home")
		public ModelAndView listEmployee(ModelAndView model) throws IOException {
			List<Employee> listEmployee = employeeService.getAllEmployees();
			model.addObject("listEmployee", listEmployee);
			model.setViewName("home");
			return model;
		}
		
		@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Employee employee = new Employee();
		model.addObject("employee", employee);
		model.setViewName("EmployeeForm");
		return model;
	}


*/	
	
	
	
	
}
