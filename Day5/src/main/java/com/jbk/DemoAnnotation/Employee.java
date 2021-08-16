package com.jbk.DemoAnnotation;

import org.springframework.stereotype.Component;

@Component("Ename")
public class Employee {
	
	Integer id;
	String name;
	
	
	public Employee() {}
	
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	

}
