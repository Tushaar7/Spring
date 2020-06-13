package com.mvn.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainTest {

	@RequestMapping(value = "log")
	public String helloWorld() {
		return "welcome";
	}

}
