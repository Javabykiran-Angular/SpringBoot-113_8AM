package com.jbk.demoonproject.service;

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

}
