package com.jbk.DemoAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jbk.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
        
        Employee e=context.getBean(Employee.class);
        System.out.println(e);
        
    }
}
