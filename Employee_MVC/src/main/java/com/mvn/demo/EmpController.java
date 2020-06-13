package com.mvn.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	
	
/*	
	@RequestMapping("/empform")
	public String showform(){
		new Emp();
		return "empform";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@ModelAttribute("emp")Emp emp){
		System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getDesignation());
		return "redirect:/viewemp";
	}

	@RequestMapping("/viewemp")
	public String viewemp(){
		List<Emp> list =new ArrayList<Emp>();
		
		list.add(new Emp(1,"Fread",35000f,"S.Engineer"));
		list.add(new Emp(1,"Mac",25000f,"IT Manager"));
		list.add(new Emp(1,"John",55000f,"Care taker"));
		
		return "viewemp";
		
	}
*/
	



	@RequestMapping("/empform")
	public ModelAndView showform(){
		return new ModelAndView("empform","command",new Emp());	
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp")Emp emp){
		System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getDesignation());
		
		return new ModelAndView("redirect:/viewemp");
	}
	
	@RequestMapping("/viewemp")
	public ModelAndView viewemp(){
		
		List<Emp> list = new ArrayList<Emp>();
		
		list.add(new Emp(1,"Fread",35000f,"S.Engineer"));
		list.add(new Emp(2,"John",25000f,"IT manager"));
		list.add(new Emp(3,"Roman",55000f,"Care Taker"));
		
		return new ModelAndView("viewemp","list",list);
	}
	

}
