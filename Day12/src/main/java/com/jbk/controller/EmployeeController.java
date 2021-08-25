package com.jbk.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Employee;
import com.jbk.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Value("${emp.id}")
	int myid;
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/getall")
	public String GetAll() {
		System.out.println("My Id is :: =>>>> "+myid);
		return "Get All";
		
	}
	
	@GetMapping("/particulardata/{id}")
	public String GetParticularRecord(@PathVariable int id) {
		
		System.out.println("==>> "+id);
		return "Particular data";
	}
	
	@GetMapping("/particulardata1/{id}")
	public String GetParticularRecord1(@PathVariable("id") int myid) {
		
		System.out.println("==>> "+myid);
		return "Particular data";
	}
	
	@GetMapping("/particulardata2/{id}/{strdata}")
	public String GetParticularRecord2(@PathVariable int id,@PathVariable String strdata) {
		System.out.println("==>>> "+id);
		System.out.println("==>>> "+strdata);
		
		return "Particular data";
		
	}
	
	@GetMapping("/GetAllEmp")
	public ArrayList<Employee> GetAllEmp(){
				
		ArrayList<Employee> list=service.GetAllemp();
				
		return list;
		
	}
	
	
	
}
