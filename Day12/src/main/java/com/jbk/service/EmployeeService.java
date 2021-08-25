package com.jbk.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.EmplyoeeDAO;
import com.jbk.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmplyoeeDAO dao;

	public ArrayList<Employee> GetAllemp(){
		
//		ArrayList<Employee> list=new ArrayList<Employee>();
//		
//		list.add(new Employee(2, "Sumit"));
//		list.add(new Employee(3, "Kiran"));
//		list.add(new Employee(4, "Spruha"));
		
		ArrayList<Employee> list=dao.GetAllEmployee();
		
		
		return list;
	}
	
	
	
}
