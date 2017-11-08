package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
		String message="HELLO AND WELCOME TO SPRING MVC";
		return new ModelAndView("hellopage","message",message);
		
	}
}
