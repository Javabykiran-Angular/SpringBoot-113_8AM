package com.jbk.DemoOnDI;

public class Address {
	
	int cid;
	String cname;
	
	public Address() {}
	
	
	public Address(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Address [cid=" + cid + ", cname=" + cname + "]";
	}
	
	

}
