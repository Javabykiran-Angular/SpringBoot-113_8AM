package com.jbk.demoonproject.service;

import java.util.List;

import com.jbk.demoonproject.entity.User;

public interface ServiceInterface {
	public boolean LoginCheck(User u);
	public List<User> listofUser();
	public User getParticularUser(int id);
	public void UpdateUser(User u);
	public void DeleteUser(int id);
}
