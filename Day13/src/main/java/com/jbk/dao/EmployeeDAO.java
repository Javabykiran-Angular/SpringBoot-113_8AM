package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Country;

@Repository
public class EmployeeDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public String AddCountry(Country c) {
		
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		int i=(int)session.save(c);
		transaction.commit();
		
		if(i>0) {
			return "Country "+c.getCid()+" Addedd Successfully";
		}else {
			return "Something Went Wrong!!";
		}
		
		
	}

}
