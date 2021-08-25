package com.jbk.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.jbk.entity.Employee;

@Repository
public class EmplyoeeDAO {

	public ArrayList<Employee> GetAllEmployee(){
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee(2, "Puja"));
		list.add(new Employee(3, "Ketan"));
		list.add(new Employee(4, "Vaibhav"));
		
		return list;
		
	}
	
}
