package com.project.userlogin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.userlogin.domain.User;

@Repository
public class LoginDaoImpl implements LoginDao{
	
	@Autowired
	SessionFactory factory;
	
	public User getUserDetails(User user) {
		
		Session s = factory.openSession();
		System.out.println("successfully opened the connection");
		 user = (User) s.get(com.project.userlogin.domain.User.class,1);
		 System.out.println(user.getUsername());
		s.close();
		return null;
	}

	public String saveUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUser(String username, String password) {
		// TODO Auto-generated method stub
	    Session s = factory.openSession();
	    Query query = s.createQuery("from User user where user.username = :username and user.password = :password");
	    query.setParameter("username", username);
	    query.setParameter("password", password);
	    List<User> users = (List<User>)query.list();
	    
	    for (User user : users) {
			System.out.println(user.getUsername());
		}
		
	    return null;
	}
	
	

}
