package com.jbk.DemoSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping("/myfirstservice")
	public String FirstApi() {
		//logic
		System.out.println("In myfirstservice Method");
		return ("My First API ");
	}
	
	@RequestMapping(value = "/mySecondService",method = RequestMethod.GET)
	public String SecondApi() {
		
		return ("My Second API");
	}
	
	@RequestMapping(value = "/postrequest",method = RequestMethod.POST)
	public String PostRequest() {
		
		return ("My Post Request Response...");
	}
	
	@RequestMapping(value = "/putRequest",method = RequestMethod.PUT)
	public String PutRequest() {
		
		return ("My Update Request...");
	}
	
	@RequestMapping(value = "/deleteRequest",method = RequestMethod.DELETE)
	public String DeleteRequest() {
		
		return ("My Delete Request...");
	}
	
	
	
	
	
	
}
