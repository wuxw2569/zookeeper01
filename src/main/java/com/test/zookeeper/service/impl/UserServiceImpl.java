package com.test.zookeeper.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.zookeeper.data.User;
import com.test.zookeeper.repository.UserRepository;
import com.test.zookeeper.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public boolean add(String name,Integer age) {
		 User temp =new User();
		 temp.setName(name);
		 temp.setAge(age);
		return userRepository.save(temp) != null;
	}
	
	@Override
	public List<User> getList() {

		return userRepository.findAll();
	}
	
}
