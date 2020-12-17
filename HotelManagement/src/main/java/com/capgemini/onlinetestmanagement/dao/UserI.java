package com.capgemini.onlinetestmanagement.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinetestmanagement.pojo.UserEntity;

@Repository
public interface UserI extends JpaRepository<UserEntity,Long> {
	
	@Query("from UserEntity userentity where userentity.login = :logIn")
	UserEntity findLogin(String logIn);
}
