package com.jbk.SprinIOCDemo;

public class Employee {
	
	int id;
	String name;
	

	public Employee() {
		System.out.println("Employee Class Object Created");
	}
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
