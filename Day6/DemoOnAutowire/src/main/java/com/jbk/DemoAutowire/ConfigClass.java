package com.jbk.DemoAutowire;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = {"com.jbk"})
@PropertySource("classpath:employee.properties")
public class ConfigClass {

}
