package com.jbk.service;

import java.util.List;

import com.jbk.entity.Country;

public interface EmployeeServiceInterface {
	
	public String AddCountry(Country c);
	public List<Country> GetAllCountry();
	
	//All method Should be present
}
