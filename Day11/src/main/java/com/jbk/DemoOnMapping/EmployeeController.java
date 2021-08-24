package com.jbk.DemoOnMapping;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@GetMapping("/getmapping")
	public String GetMapping() {
		return "U are in Get Mapping Method";
	}
	
	@PostMapping("/postmapping")
	public String PostMapping() {
		return "U are in Post mapping...";
	}
	
	@GetMapping("/getAllEmp")
	public ArrayList<Employee> getAllEmployee() {
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1,"Sumit","Developer"));
		list.add(new Employee(2,"Kiran","Admin"));
		list.add(new Employee(3,"Spruha","Marketing"));
		
		return list;
		
	}
	
	@PostMapping("/postEmp")
	public String addEmployee(@RequestBody Employee e) {
		
		System.out.println(e);		
		
		return "Employee Added Successfully";
	}
	
	

}
