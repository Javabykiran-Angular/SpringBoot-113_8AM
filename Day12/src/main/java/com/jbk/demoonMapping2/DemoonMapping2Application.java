package com.jbk.demoonMapping2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jbk"})
public class DemoonMapping2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoonMapping2Application.class, args);
	}

}
