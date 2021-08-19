package com.jbk.entity;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	double accBal=500;

	public void deposits() {
		System.out.println("U Deposit amount......");
	}
	
	public void  deposits1(double amt) {
		System.out.println("U Deposit amount......");
	}
	
	public void withdraw() {
		System.out.println("U Withdraw amount......");
	}
	
	
	public String withdraw1() {
		if(this.accBal<1000) {
			return "In sufficient balance to withdraw Amount....";
		}else {
			return "Thank You for our Banking";
		}	
		
	}
	
public String CheckCal() {
		
		try {
		int val = 10/0;
		
		}
//		catch(Exception e) {
//			System.out.println("In Catch Block");
//		}		
		finally {
			System.out.println("Simple");
		} 
		return "hello";
	}
	
	
	
}
