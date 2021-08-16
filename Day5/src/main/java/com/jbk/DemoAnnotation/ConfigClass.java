package com.jbk.DemoAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jbk.entity.Country;

@Configuration
@ComponentScan(basePackages = {"com.jbk"})
public class ConfigClass {
	
//	@Bean
//	public Employee getInstance() {
//		
//		Employee e=new Employee();
//		return e;
//		
////		return (new Employee());
//	}
	
//	@Bean
//	public Employee myInstance() {
//		
//		Employee e1=new Employee();
//		return e1;
//		
////		return (new Employee());
//	}
	
//	@Bean
//	public Country getCountry() {
//		
//		return (new Country());
//	}
	
	
	

}
