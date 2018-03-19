package com.akashah.hello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String Hello(Model model, @RequestParam(value = "name", required = false, defaultValue = "Human") String namestring) {
		
		model.addAttribute("name", namestring);
		return "Hello.jsp";
	
	}
	

}
