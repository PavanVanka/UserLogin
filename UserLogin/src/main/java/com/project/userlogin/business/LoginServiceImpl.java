package com.project.userlogin.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.userlogin.dao.LoginDao;
import com.project.userlogin.domain.User;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginDao loginDao;

	public User getUserDetails(User user) {
		// TODO Auto-generated method stub
		return loginDao.getUserDetails(user);
	}

	public String saveUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUser(String username, String password) {
		
		loginDao.findUser(username,password);
		return null;
	}

	public String encryptPassword(String str) {
		
		return null;
	}

	public String decryptPassword(String str) {
		return null;
	}
	
	

}
