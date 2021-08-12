package com.jbk.SprinIOCDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        Employee e=new Employee();
        
        	ApplicationContext context= new ClassPathXmlApplicationContext("springbeans.xml");
        
//        		Employee e=(Employee)context.getBean("emp");
        	Employee e=context.getBean("emp",Employee.class);        
        System.out.println("e object "+e);
        Employee e1=context.getBean("emp",Employee.class);        
        System.out.println("e1 Object "+e1);
        
    }
}
