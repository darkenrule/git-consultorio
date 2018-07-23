package com.darkenrule.app.ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darkenrule.app.ws.dao.UserDao;
import com.darkenrule.app.ws.entity.User;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public Iterable<User> getUsers() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
