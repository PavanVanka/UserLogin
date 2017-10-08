package com.project.userlogin.business;

import com.project.userlogin.domain.User;

public interface LoginService {

	public User getUserDetails(User user) ;
	
	public String saveUser();
	
	public User findUser(String username,String password);
	
	public String encryptPassword(String str);
	
	public String decryptPassword(String str);
}
