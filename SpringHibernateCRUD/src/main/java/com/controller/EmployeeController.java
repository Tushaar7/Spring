package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

//import org.eclipse.jdt.internal.compiler.ast.FalseLiteral;
//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
import com.service.EmployeeService;

@Controller
public class EmployeeController {

	/*
	 * private static final Logger logger =
	 * Logger.getLogger(EmployeeController.class);
	 * 
	 * 
	 * public EmployeeController() { System.out.println("EmployeeController()");
	 * }
	 */

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/home")
	public ModelAndView listEmployee(ModelAndView model,
			@RequestParam(value = "msg", required = false) String msg)
			throws IOException {
		List<Employee> listEmployee = employeeService.getAllEmployees();
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		model.addObject("msg", msg);
		return model;
	}

	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model,
			@RequestParam(value = "msg", required = false) String msg) {
		Employee employee = new Employee();
		model.addObject("employee", employee);
		model.addObject("msg", msg);
		model.setViewName("EmployeeForm");
		return model;
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(
			@ModelAttribute(value = "employee") Employee employee) {

		boolean result = employeeService.addEmployee(employee);
		String msg = null;
		if (result == false)
			msg = "saved";
		else
			msg = "not saved";
		return new ModelAndView("redirect:/newEmployee.htm", "msg", msg);
	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("id"));
		employeeService.deleteEmployee(employeeId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("id"));
		Employee employee = employeeService.getEmployee(employeeId);
		ModelAndView model = new ModelAndView("EmployeeForm");
		model.addObject("employee", employee);

		return model;
	}

	/*
	 * @RequestMapping(value="/") public ModelAndView listEmployee(ModelAndView
	 * model) throws IOException{
	 * 
	 * List<Employee> listEmployee = employeeService.getAllEmployees();
	 * 
	 * model.addObject("listEmployee",listEmployee); model.setViewName("home");
	 * return model; }
	 * 
	 * @RequestMapping(value = "/newEmployee",method = RequestMethod.GET) public
	 * ModelAndView newContaact(ModelAndView model){ Employee employee = new
	 * Employee(); model.addObject("employee", employee);
	 * model.setViewName("EmployeeForm"); return model; }
	 * 
	 * @RequestMapping(value="/saveEmployee",method = RequestMethod.POST) public
	 * ModelAndView saveEmployee(@ModelAttribute Employee employee){ if
	 * (employee.getId() == 0) { // if employee id is 0 then creating the //
	 * employee other updating the employee
	 * employeeService.addEmployee(employee); } else {
	 * employeeService.updateEmployee(employee); } return new
	 * ModelAndView("redirect:/"); }
	 * 
	 * @RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	 * public ModelAndView deleteEmployee(HttpServletRequest request) { int
	 * employeeId = Integer.parseInt(request.getParameter("id"));
	 * employeeService.deleteEmployee(employeeId); return new
	 * ModelAndView("redirect:/"); }
	 * 
	 * @RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
	 * public ModelAndView editContact(HttpServletRequest request) { int
	 * employeeId = Integer.parseInt(request.getParameter("id")); Employee
	 * employee = employeeService.getEmployee(employeeId); ModelAndView model =
	 * new ModelAndView("EmployeeForm"); model.addObject("employee", employee);
	 * 
	 * return model; }
	 */
}
