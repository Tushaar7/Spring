package com.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
import com.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/home")
	public ModelAndView listEmployee(ModelAndView model){
		List<Employee> listEmployee = employeeService.getAllEmployees();
		model.addObject("listEmployee",listEmployee);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value="/newEmployee")
	public ModelAndView newContact(ModelAndView model){
			Employee employee = new Employee();
			model.addObject("employee",employee);
			model.setViewName("EmployeeForm");
		return model;
	}
	
	@RequestMapping(value="/saveEmployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee){
		
		if(employee.getId() == 0){
			employeeService.addEmployee(employee);
		}else {
			employeeService.updateEmployee(employee);
		}
		return new ModelAndView("/home");
	}
	
	@RequestMapping(value="/deleteEmployee")
	public ModelAndView deleteEmployee(HttpServletRequest request){
		int employeeId = Integer.parseInt(request.getParameter("id"));
		employeeService.deleteEmployee(employeeId);
		return new ModelAndView("/home");
	}
	
	@RequestMapping(value="/editEmployee")
	public ModelAndView editContact(HttpServletRequest request){
		int employeeId = Integer.parseInt(request.getParameter("id"));
		Employee employee = employeeService.getEmployee(employeeId);
		ModelAndView model = new ModelAndView("EmployeeForm");
		model.addObject("employee",employee);
		return model;	
	}
}
