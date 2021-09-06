package com.jbk.demoonproject.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jbk.demoonproject.entity.User;


public interface UserDaoImp {
	public boolean LoginCheck(User u);
	public List<User> listofUser();
	public User getParticularUser(int id);
	public void UpdateUser(User u);
	public void DeleteUser(int id);
}
