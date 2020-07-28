package com.deptempspbsecurity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.deptempspbsecurity.dao.UserRepo;
import com.deptempspbsecurity.model.User;


@Service
public class UserDetailsServices implements UserDetailsService {

	
@Autowired
	UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	Optional<User> user = userRepo.findByUserName(username);
	System.out.println("service  user detail");
	user.orElseThrow(()-> new UsernameNotFoundException("User not found"+username));
	System.out.println("user name "+user.get().getUserName()+"pass word "+user.get().getPassword());
		return user.map(UserDetailss::new).get();
	}

}
