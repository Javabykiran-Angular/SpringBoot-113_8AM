package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Country;
import com.jbk.entity.Emplyoee;
import com.jbk.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	//API 1
	@PostMapping("/addcountry")
	public String AddCountry(@RequestBody Country c) {
		
		String str=service.AddCountry(c);
		
		return str;
		
	}
	
	//API 2
	
	@GetMapping("/getAllCountry")
	public List<Country> GetAllCountry(){
		List<Country>list=service.GetAllCountry();
		return list;
		
	}
	//API 3
	
	@PutMapping("/updatecountry")
	public String UpdateCountry(@RequestBody Country c){
		
		String str=service.UpdateCountry(c);
		return str;
		
	}
	//Api 4
	
	@DeleteMapping("/deletecountry/{cname}")
	public String DeleteCountry(@PathVariable String cname){
		String str=service.DeleteCountry(cname);
		return str;
	}
	
	//API 5 	
	@GetMapping("/getparticularRecord/{cid}")
	public Country GetParticularCountry(@PathVariable Integer cid){
		Country c=service.GetParticularCountry(cid);
		return c;
	}
	
	// API 6
	@PostMapping("/addemployee")
	public String AddEmployee(@RequestBody Emplyoee e) {
		String str=service.AddEmployee(e);
		return str;
	}
	
	
	
	
	
}
