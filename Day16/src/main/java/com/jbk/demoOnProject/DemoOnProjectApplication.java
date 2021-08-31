package com.jbk.demoOnProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jbk"})
public class DemoOnProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOnProjectApplication.class, args);
	}

}
