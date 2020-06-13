package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value="HelloAction")
	public String helloMethod(Model model, HttpServletRequest req){

		String message = req.getParameter("text");
		model.addAttribute("message",message);
		return "welcome";
	
	}
	
}
