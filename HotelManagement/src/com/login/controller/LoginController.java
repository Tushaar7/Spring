package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value="/LoginAction")
	public ModelAndView LoginPage(){
		System.out.println("Login Page...");
		return new ModelAndView("LoginPageView");
	}
	
	
	@RequestMapping(value="/HomePageAction")
	public ModelAndView HomePage(){
		
		System.out.println("Home Page...");
		return new ModelAndView("HomePageView");
	}
}
