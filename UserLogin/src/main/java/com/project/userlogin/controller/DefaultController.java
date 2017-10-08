package com.project.userlogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ContextLoaderListener;

@Controller
public class DefaultController {
	
	ContextLoaderListener c;
	
	@RequestMapping(value ="/login",method=RequestMethod.GET)
	public String redirectToLoginPage() {
		return "redirect:/user/login";
	}
}
