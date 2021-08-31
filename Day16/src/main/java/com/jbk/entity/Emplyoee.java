package com.jbk.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Emplyoee implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cid")
	private Country country;
	
	private String name;
	private	String status;
	private String department;
	
	private String phoneno;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "createddtm",nullable = false)
	private Date createddtm;
	
	private String createdby;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "updatateddtm",nullable = false)
	private Date updatateddtm;
	
	private String updatatedby;
	
	public Emplyoee() {}
	

	public Emplyoee(Integer id, Country country, String name, String status, String department, String phoneno,
			Date createddtm, String createdby, Date updatateddtm, String updatatedby) {
		super();
		this.id = id;
		this.country = country;
		this.name = name;
		this.status = status;
		this.department = department;
		this.phoneno = phoneno;
		this.createddtm = createddtm;
		this.createdby = createdby;
		this.updatateddtm = updatateddtm;
		this.updatatedby = updatatedby;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public Date getCreateddtm() {
		return createddtm;
	}

	public void setCreateddtm(Date createddtm) {
		this.createddtm = createddtm;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getUpdatateddtm() {
		return updatateddtm;
	}

	public void setUpdatateddtm(Date updatateddtm) {
		this.updatateddtm = updatateddtm;
	}

	public String getUpdatatedby() {
		return updatatedby;
	}

	public void setUpdatatedby(String updatatedby) {
		this.updatatedby = updatatedby;
	}

	@Override
	public String toString() {
		return "Emplyoee [id=" + id + ", country=" + country + ", name=" + name + ", Status=" + status + ", department="
				+ department + ", phoneno=" + phoneno + ", createddtm=" + createddtm + ", createdby=" + createdby
				+ ", updatateddtm=" + updatateddtm + ", updatatedby=" + updatatedby + "]";
	}
	
	
	
	
	
	
	

}
