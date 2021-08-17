package com.jbk.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	Integer id;
	
	@Value("${myemployee.name}")
	String name;
	
	@Autowired
	Country country; //country=new Country();
	
	//You can Apply Autowire on field level,Constructor level,setter level
	
	public Employee() {}
	
	
	
	public Employee(Integer id, String name, Country country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}



//	public Employee(Integer id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
	
	
	
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	
	
	

}
