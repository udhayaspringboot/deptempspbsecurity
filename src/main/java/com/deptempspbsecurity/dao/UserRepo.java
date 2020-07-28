package com.deptempspbsecurity.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deptempspbsecurity.model.User;



public interface UserRepo extends JpaRepository<User, Integer> {

	
	Optional<User> findByUserName(String username); 
	
}
