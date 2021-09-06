package com.jbk.demoonproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.demoonproject.dao.UserDaoImp;
import com.jbk.demoonproject.entity.User;

@Service
public class UserServiceImp implements ServiceInterface
{
	@Autowired
	UserDaoImp userdao;
	
	@Override
	public boolean LoginCheck(User u) {
		boolean b=userdao.LoginCheck(u);
		return b;
	}

	@Override
	public List<User> listofUser() {
		List<User> list=userdao.listofUser();
		return list;
	}

	@Override
	public User getParticularUser(int id) {
		User u=userdao.getParticularUser(id);
		return u;
	}

	@Override
	public void UpdateUser(User u) {
		userdao.UpdateUser(u);
		
	}

	@Override
	public void DeleteUser(int id) {
		userdao.DeleteUser(id);
		
	}

}
