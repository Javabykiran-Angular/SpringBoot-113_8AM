package com.jbk.service;

import java.util.List;

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
	
	public List<Country> GetAllCountry(){
		List<Country> list=dao.GetAllCountry();
		return list;
	}
	
	public String UpdateCountry(Country c) {
		
		String str=dao.UpdateCountry(c);
		return str;
	}
	
	public String DeleteCountry(String cname) {
		String str=dao.DeleteCountry(cname);
		return str;
	}
	
	public Country GetParticularCountry(Integer cid) {
		Country c=dao.GetParticularCountry(cid);
		return c;
	}
	
	
}
