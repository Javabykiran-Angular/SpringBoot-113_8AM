package com.jbk.DemoAOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = {"com.jbk"})
@EnableAspectJAutoProxy
public class ConfigClass {

}
