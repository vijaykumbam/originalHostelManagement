package com.capgemini.onlinetestmanagement.security;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.capgemini.onlinetestmanagement.pojo.UserEntity;

public class MyUserDetails implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserEntity userEntity;
	public MyUserDetails(UserEntity user) {
		this.userEntity = user;
		System.out.println("User Id is "+ user.getUserId());
		System.out.println("User Name is "+ user.getFname() + user.getLname());
		System.out.println("User Role is "+ user.getRole().getName());
		System.out.println("User Password is "+ user.getPassword() + user.getConfirmPassword());
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		String role = userEntity.getRole().getName();
		return Collections.singleton(new SimpleGrantedAuthority(role));
	}

	@Override
	public String getPassword() {
		return userEntity.getPassword();
	}

	@Override
	public String getUsername() {
		return userEntity.getFname()+ " "+ userEntity.getLname();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
