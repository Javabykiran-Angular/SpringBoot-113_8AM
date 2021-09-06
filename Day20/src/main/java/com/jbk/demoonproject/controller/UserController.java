package com.jbk.demoonproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jbk.demoonproject.entity.User;
import com.jbk.demoonproject.service.ServiceInterface;

@Controller
public class UserController {
	
	@Autowired
	ServiceInterface service;
	
	@RequestMapping("/listofUser")
	public ModelAndView welcomePage() {
		List<User> list=service.listofUser();
		ModelAndView mv=new ModelAndView();
		mv.addObject("userlist", list);
		mv.setViewName("welcome");
		return mv;
	}
	
	@RequestMapping("/getUserById")
	public ModelAndView getParticularUser(@RequestParam int id) {
		User u=service.getParticularUser(id);
		ModelAndView mv=new ModelAndView();
		mv.addObject("User", u);
		mv.setViewName("update");
		return mv;
		
	}
	
	@PostMapping("/updateUser")
	public ModelAndView UpadteUser(@ModelAttribute("User") User u ) {
		service.UpdateUser(u);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("redirect:/listofUser");
		return mv;
		
	}
	
	@RequestMapping("/deleteUserById")
	public ModelAndView DeleteUser(@RequestParam int id) {
		service.DeleteUser(id);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("redirect:/listofUser");
		return mv;
		
	}
	

}
