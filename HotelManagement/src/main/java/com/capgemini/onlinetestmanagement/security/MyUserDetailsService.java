package com.capgemini.onlinetestmanagement.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagement.dao.UserI;
import com.capgemini.onlinetestmanagement.pojo.UserEntity;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private UserI userDao;
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		UserEntity obj = userDao.findLogin(login);
		if(obj==null){
			throw new UsernameNotFoundException(" Login id is not Found");
		}
		else
		return new MyUserDetails(obj);
	}

}
