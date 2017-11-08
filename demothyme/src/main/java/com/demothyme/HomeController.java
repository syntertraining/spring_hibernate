package com.demothyme;

import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;  
import org.springframework.stereotype.Controller;  

@Controller  // using @RestController annotation 
public class HomeController {
	
	  @RequestMapping("/")  
	    public String index(){  
	        return "index";  
	    }  
	  @RequestMapping(value="/save", method=RequestMethod.POST)  
	    public ModelAndView save(@ModelAttribute User user){  
	        ModelAndView modelAndView = new ModelAndView();  
	modelAndView.setViewName("save");      
	modelAndView.addObject("user", user);    
	return modelAndView;  
	    }  
}
