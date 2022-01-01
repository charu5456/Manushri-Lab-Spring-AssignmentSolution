package com.greatlearning.studentfestevent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.studentfestevent.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User getByUsername(String username);
	
}