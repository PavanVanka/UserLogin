package com.project.userlogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.userlogin.business.LoginService;

@Controller
@RequestMapping(value = "/user")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login/submit",method = RequestMethod.POST)
	public String submit(@RequestParam(required=true) String username,@RequestParam(required=true)String password,ModelMap view) {
		System.out.println("into the submit method with username:"+username+",password:"+password);
		view.addAttribute("username", username);
		loginService.findUser(username, password);
		return "success";
	}
	
/*	@RequestMapping(value="/login/submit",method = RequestMethod.POST)
	public String submit(@ModelAttribute User user,ModelMap view) {
		System.out.println("into the submit method with username:"+user.getUsername()+",password:"+user.getPassword());
		view.addAttribute("username", user.getUsername());
		loginService.getUserDetails(user);
		return "success";
	}*/
	

}
