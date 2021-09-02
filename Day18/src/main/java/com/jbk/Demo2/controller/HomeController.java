package com.jbk.Demo2.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String homePage(){
		return "home";
	}
	
//	@RequestMapping(value = "/login")
//	public String loginPage() {
//		System.out.println("U r in Login page controller");
//		
//		return "mylogin";
//	}
	
	@GetMapping("/login")
	public String loginPage() {
		System.out.println("U r in Login page controller");
		
		return "mylogin";
	}
	
	
//	@RequestMapping(value = "/loginuser")
//	public String LoginUser() {
//		
//		return "welcome";
//	}
	
//	@RequestMapping(value = "/loginuser",method = RequestMethod.POST)
//	public String LoginUser() {
//		System.out.println("Post Method Called .....");
//		return "welcome";
//	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String LoginUser(@RequestParam("username") String myusername,
			@RequestParam("password") String mypassword) {
		
		System.out.println("Post Method Called .....");
		
		System.out.println("Username is "+myusername);
		System.out.println("Password is "+mypassword);
		
		
		return "welcome";
	}
	
	@RequestMapping("/**")
	public String NotFoundOage() {
		return "notfound";
	}
	
	
}
