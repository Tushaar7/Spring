package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Student;
import com.service.StudentService;

public class Controller {

	@Autowired
	StudentService studentservice;
	
	@RequestMapping(value="studPage.htm")
	public String getPage(Model modelMap){
		modelMap.addAttribute("student",new Student());
		return "register";
	}
	
	@RequestMapping(value="saveStudent.htm")
	public String saveStudentRegister(ModelMap modelMap, @ModelAttribute(value="student")Student student){
		Boolean result = studentservice.createStudent(student);
		
		if(result == false){
			modelMap.addAttribute("msg","save Successfully...");
		}else{
			modelMap.addAttribute("msg","Something went to wrong...");
		}
		return "register";
	}
	
}
