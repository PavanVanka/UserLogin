package com.project.userlogin.dao;

import com.project.userlogin.domain.User;

public interface LoginDao {

	public User getUserDetails(User user);

	public String saveUser();
	
	public User findUser(String username ,String password);
}
