package com.jbk.dao;

import com.jbk.entity.Emplyoee;

public interface EmployeeDaoInterface {
	public Emplyoee getParticularEMP(Integer id);
	public String deleteEmployee(Integer id);

}
