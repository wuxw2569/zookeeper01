package com.test.zookeeper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.zookeeper.data.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
