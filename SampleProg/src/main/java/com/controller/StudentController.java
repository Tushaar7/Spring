package com.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Student;
import com.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping(value="/home")
	public ModelAndView listStudent(ModelAndView model)throws IOException{
		
		List<Student> listStudent = studentService.getAllStudents();
		
		return model;
	}
	
	
}


