package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.ModelC;
import com.service.ServiceI;

@Controller
public class ABC
{

	@Autowired
	ServiceI serviceI;
	
	public ServiceI getServiceI() 
	{
		return serviceI;
	}

	public void setServiceI(ServiceI serviceI) {
		this.serviceI = serviceI;
	}

	@RequestMapping("first")
	public ModelAndView aa()
	{
		System.out.println("In controller");
		return new ModelAndView("sec");
	}
	
	@RequestMapping("login")
	public ModelAndView ba(@ModelAttribute("registercmd")ModelC modelC)
	{
		System.out.println("way to login page");
		return new ModelAndView("Reg");
	}
	
	@RequestMapping("updateD")
	public ModelAndView ca(@ModelAttribute("registercmd")ModelC modelC)
	{
		System.out.println("way to login page");
		return new ModelAndView("update");
	}
	
	@RequestMapping("deleteD")
	public ModelAndView b(@ModelAttribute("registercmd")ModelC modelC)
	{
		System.out.println("way to login page");
		return new ModelAndView("del");
	}
	
	@RequestMapping(value="saveD",method=RequestMethod.POST)
	public ModelAndView cc(Model model,@ModelAttribute("registercmd")ModelC modelc)
	{
		System.out.println("In reg");
		serviceI.SaveData(modelc);
		return new ModelAndView("Succ");
	}
	

	@RequestMapping(value="updD",method=RequestMethod.POST)
	public ModelAndView c(Model model,@ModelAttribute("registercmd")ModelC modelc)
	{
		System.out.println("In reg");
		serviceI.upData(modelc);
		return new ModelAndView("Succ");
	}
}
