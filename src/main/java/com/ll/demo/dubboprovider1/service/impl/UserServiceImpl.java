package com.ll.demo.dubboprovider1.service.impl;

import org.springframework.stereotype.Service;

import com.ll.demo.dubboInterface.entity.User;
import com.ll.demo.dubboInterface.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@SuppressWarnings({ "deprecation", "null" })
	@Override
	public User save(User user) {
		user.setUserId(++UserIdGenerator.id);
		return user;
	}

}
