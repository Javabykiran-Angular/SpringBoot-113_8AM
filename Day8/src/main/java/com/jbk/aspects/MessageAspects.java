package com.jbk.aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageAspects {

	@After("execution (public void com.jbk.entity.Account.deposits())")
	public void SendSMS() {
		
		System.out.println("Sms is send to client");
	}
	
//	
//	@After ("execution (public void deposits1(..))")
//	void sendSMS(JoinPoint jt) {
//		System.out.println("Send SMS To Client");
//		System.out.println("Your Depoist Amount is "+Arrays.toString(jt.getArgs()));
//		System.out.println("Joint Point method is "+jt.getSignature());
//		System.out.println("Joint Point method name is "+jt.getSignature().getName());
//	}
	

//	@Before("execution (public void withdraw(..))")
//	void pinValid() {
//		System.out.println("Enter your pin for validation");
//	}
	
	
//	@Before("execution (* com.jbk.entity.Account.* (..))")
//	void pinValid() {
//		System.out.println("Enter your pin for validation");
//	}
	
	
//	@Around("execution (* com.jbk.entity.Account.*(..))")
//	public void AroundmyMEthod(ProceedingJoinPoint p) {
//		
//		System.out.println("========Before Method Pin Valid Logic=====");
//		
//		try {
//			p.proceed();
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		//Send sms logic
//		
//		System.out.println("========After Method Send SMS Logic=====");
//		
//	}
//	
	
	
	@AfterReturning(pointcut = "execution (* com.jbk.entity.Account.*(..))",
			returning="myMsg")
	public void CheckReturning(String myMsg) {
		System.out.println("Your MSG is==>> "+myMsg);
	}
	
	
	@AfterThrowing(pointcut = "execution (* com.jbk.entity.Account.*(..))",
			throwing = "ex")
	public void CatchThrow(Exception ex) {
		ex.printStackTrace();
	}
	
	
	
}
