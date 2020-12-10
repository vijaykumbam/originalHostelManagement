package com.capgemini.onlinetestmanagement.service;

import java.util.List;

import com.capgemini.onlinetestmanagement.pojo.UserEntity;

public interface UserServiceI {

		 //Basic CRUD Operations
		 long addUser(UserEntity user);
		 void updateUser(UserEntity user);
		 void deleteUser(UserEntity user);
		 UserEntity findByLogin(String login);
		
		
		 List<UserEntity> search();
		 boolean changePassword(long id,String oldPassword, String newPassword);
		 boolean forgetPassword(String login);
		 long registerUser(UserEntity user);

		
		 UserEntity findByPk (UserEntity user);
		 List<UserEntity> search(UserEntity user, long pageNo, int pageSize);
		 UserEntity authenicate(UserEntity user);
}
