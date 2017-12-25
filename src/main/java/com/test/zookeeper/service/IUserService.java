package com.test.zookeeper.service;

import java.util.List;

import com.test.zookeeper.data.User;

public interface IUserService {

	boolean add(String name,Integer age);

	List<User> getList();

}
