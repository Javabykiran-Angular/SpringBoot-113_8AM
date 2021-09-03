package com.jbk.demoonproject.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jbk.demoonproject.entity.User;
import com.jbk.demoonproject.service.ServiceInterface;

@Controller
public class HomeController {
	
	@Autowired
	ServiceInterface service;

	@RequestMapping(value="/")
	public String homePage(){
		return "home";
	}
	
	@GetMapping("/login")
	public String loginPage(Model m ) {
		m.addAttribute("user", new User());
		return "login";
	}
	
	@PostMapping("/login")
	public ModelAndView LoginUser(@ModelAttribute("user") User u) {
		
		boolean b=service.LoginCheck(u);
		ModelAndView mv=new ModelAndView();
		
		if(b==true) {
			mv.setViewName("redirect:welcome");
		}else {
			mv.addObject("msg", "Login Failed Incorrect Username & password");
			mv.setViewName("login");
		}
		
		
		
		return mv;
		
	}
	
}
