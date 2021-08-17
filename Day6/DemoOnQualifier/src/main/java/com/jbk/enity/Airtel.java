package com.jbk.enity;

import org.springframework.stereotype.Component;

@Component("myairtel")
public class Airtel implements Sim
{

	public String ShowNetwork() {
		
		return " Airtel";
	}

}
