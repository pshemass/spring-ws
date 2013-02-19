package com.mycompany.hr.dao;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService
{
	public static final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

	public UserDetailsServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		logger.info(String.format("Checking user details for <%s>.", username));
		
		return new User(username, "xxxx", Collections.<GrantedAuthority>emptyList());
	}

}
