package com.jbk.entity;

import org.springframework.stereotype.Component;

@Component
public class Country {
	
	Integer cid;
	String cname;
	
	public Country() {}
	
	public Country(Integer cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	

}
