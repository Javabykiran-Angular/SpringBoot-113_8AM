package com.jbk.demoonproject.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.demoonproject.entity.User;

@Repository
public class UserServiceDao implements UserDaoImp
{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean LoginCheck(User u) {
	
		boolean b=false;
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(User.class);
		criteria.add(Restrictions.eq("username", u.getUsername()));
		criteria.add(Restrictions.eq("password", u.getPassword()));
		
		User user=(User)criteria.uniqueResult();
		
		if(user!=null) {
			b=true;
		}else {
			b=false;
		}
		
		
		return b;
	}

}
