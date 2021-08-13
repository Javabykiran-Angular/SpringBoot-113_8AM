package com.jbk.DemoOnDI;

public class Employee {
	
	int id;
	String name;
	
	Address addr; //addr=new Address();
	
	
	public Employee() {}
	
	public Employee(int myid, String name1,Address a) {
		super();
		this.id = myid;
		this.name = name1;
		this.addr=a;
	}
	
	
	
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public int getId() {
		return id;
	}
	public void setId1(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + "]";
//	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
	
	
	

}
