package com.greatlearning.studentfestevent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.studentfestevent.entity.User;
import com.greatlearning.studentfestevent.repository.UserRepository;
import com.greatlearning.studentfestevent.security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.getByUsername(username);
		
		if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
		return new MyUserDetails(user);
	}
}