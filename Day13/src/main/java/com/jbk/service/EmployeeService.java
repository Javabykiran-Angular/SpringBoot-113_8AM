package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.EmployeeDAO;
import com.jbk.entity.Country;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO dao;
	
	public String AddCountry(Country c) {
		String str=dao.AddCountry(c);
		
		return str;
	}
	
}
