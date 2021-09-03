package com.jbk.demoonproject.dao;

import org.springframework.stereotype.Repository;

import com.jbk.demoonproject.entity.User;


public interface UserDaoImp {
	public boolean LoginCheck(User u);
}
