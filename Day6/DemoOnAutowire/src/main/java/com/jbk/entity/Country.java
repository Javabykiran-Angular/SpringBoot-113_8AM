package com.jbk.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {
	
	Integer Cid;
	String cname;
	
	public Country() {}
	
//	@Autowired
//	public Country(@Value("9") Integer cid, @Value("Raokhande")String cname) {
//		super();
//		Cid = cid;
//		this.cname = cname;
//	}
	
	@Autowired
	public Country(@Value("${country.cid}") Integer cid, @Value("${country.cname}")String cname) {
		super();
		Cid = cid;
		this.cname = cname;
	}
	public Integer getCid() {
		return Cid;
	}
	public void setCid(Integer cid) {
		Cid = cid;
	}
	public String getCname() {
		return cname;
	}
	
	//@Autowired
	public void setCname(//@Value("Sumit") 
	String cname) {
		this.cname = cname;
	}
	
	@Override
	public String toString() {
		return "Country [Cid=" + Cid + ", cname=" + cname + "]";
	}
	
	
	
}
