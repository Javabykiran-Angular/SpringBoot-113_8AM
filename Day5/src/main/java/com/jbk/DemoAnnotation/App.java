package com.jbk.DemoAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jbk.entity.Country;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
    	
    			Employee emp= context.getBean(Employee.class);
    			System.out.println(emp);
    			
    			
//    			Employee e_1=context.getBean("employee",Employee.class);
//    			System.out.println("employee .."+ e_1);
    			
    			
    			Employee e_1=context.getBean("Ename",Employee.class);
    			System.out.println("employee .."+ e_1);
    			
    			
//    			Employee e1=context.getBean(Employee.class);
//    			System.out.println(e1);
//    			
//    			Employee e2=context.getBean("getInstance",Employee.class);
//    			System.out.println(e2);
    			
//    			Employee e3=context.getBean("myInstance",Employee.class);
//    			System.out.println("myInstance "+e3);
    			
    			
    			Country c=context.getBean(Country.class);
    			System.out.println("Using Compoent "+c);
    	
    			((AnnotationConfigApplicationContext)context).close();
    	
    }
}
