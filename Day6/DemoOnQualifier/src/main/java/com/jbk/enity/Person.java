package com.jbk.enity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	String name;
	
	@Autowired
	@Qualifier("myjio")
	Sim sim1;
	
	@Autowired
	@Qualifier("myairtel")
	Sim sim2;
	
	public Person() {}
	
	public void Display() {
		System.out.println("Sim1 Has Network "+sim1.ShowNetwork());
		System.out.println("Sim2 Has Network "+sim2.ShowNetwork());
	}
	
}
