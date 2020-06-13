package com.mvn.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {

	@RequestMapping(value="/hello")

public String helloWorld(HttpServletRequest request, HttpServletResponse responce, Model model){
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		if(password.equals("root")){
			String message = "Hello " + name;
			model.addAttribute("message", message);
			return "hellopage";
		}
		else{
			return "errorpage";
		}
	}
	
	
	
	/* public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse res) {  
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
          
        if(password.equals("root")){  
        String message = "HELLO "+name;  
        return new ModelAndView("hellopage", "message", message);  
        }  
        else{  
            return new ModelAndView("errorpage", "message","Sorry, username or password error");  
        }  
   */ 
	
}  



