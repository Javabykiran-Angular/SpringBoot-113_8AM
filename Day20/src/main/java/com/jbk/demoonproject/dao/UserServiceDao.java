package com.jbk.demoonproject.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.omg.CORBA.CTX_RESTRICT_SCOPE;
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

	@Override
	public List<User> listofUser() {
		Session session=sessionFactory.openSession();
		List<User> list= session.createCriteria(User.class).list();
		
		return list;
	}

	@Override
	public User getParticularUser(int id) {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(User.class);
		criteria.add(Restrictions.eq("id", id));
		User u=(User)criteria.uniqueResult();
		
		return u;
	}

	@Override
	public void UpdateUser(User u) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.saveOrUpdate(u);
		tx.commit();
		
	}

	@Override
	public void DeleteUser(int id) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(User.class);
		criteria.add(Restrictions.eq("id", id));
		User u=(User)criteria.uniqueResult();
		session.delete(u);
		tx.commit();
		
	}

}
