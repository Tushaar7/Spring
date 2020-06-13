package com.register.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterCustomerController {

	@RequestMapping(value="/RegisterCustomerAction")
	public ModelAndView Register(){
		
		System.out.println("Register Customer Controller...");
		return new ModelAndView("RegisterPageView");
	}
	
}
