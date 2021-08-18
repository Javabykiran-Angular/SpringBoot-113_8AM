package com.jbk.entity;

import org.springframework.stereotype.Component;

@Component
public class Account {

	public void deposits() {
		System.out.println("U Deposit amount......");
	}
	
	public void  deposits1(double amt) {
		System.out.println("U Deposit amount......");
	}
	
	public void withdraw() {
		System.out.println("U Withdraw amount......");
	}
	
	
}
