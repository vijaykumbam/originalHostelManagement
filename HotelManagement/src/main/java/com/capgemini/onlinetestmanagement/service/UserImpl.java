package com.capgemini.onlinetestmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagement.dao.UserI;
import com.capgemini.onlinetestmanagement.pojo.UserEntity;

@Service
public class UserImpl implements UserServiceI{

	@Autowired
	private UserI userl;

	@Override
	public long addUser(UserEntity user) {
		long userId= user.getUserId();
		userl.save(user);
		return userId;
	}

	@Override
	public void updateUser(UserEntity user) {
		if(userl.existsById(user.getUserId()) == true)
		{
			userl.saveAndFlush(user);
		}
		
	}

	@Override
	public void deleteUser(UserEntity user) {
		long userId= user.getUserId();
		Optional<UserEntity> obj = userl.findById(userId);
		if(obj.isPresent())
		{
			UserEntity userObj = obj.get();
			userl.delete(userObj);
		}
	}


	@Override
	public List<UserEntity> search() {
		List<UserEntity> userobj = userl.findAll();
		if(userobj.isEmpty() == false)
			return userobj;
		else
		return null;
	}

	
	@Override
	public boolean changePassword(long id, String oldPassword, String newPassword) {
		Optional<UserEntity> obj = userl.findById(id);
		if(obj.isPresent())
		{
			UserEntity userObj = obj.get();
			if(userObj.getPassword().contentEquals(oldPassword))
			{
				userObj.setPassword(newPassword);
				userObj.setConfirmPassword(newPassword);
				return true;
			}
			else {
				//OldPassword MisMatch Exception
				System.out.println(" Try to enter the Crt Old Password");
				return false;
			}
		}
		return false;
	}

	// Can Be implemented by NamedQuery.
	@Override
	public UserEntity findByLogin(String login) {
		
		return null;
	}
	
	// Can Be implemented by NamedQuery.
	@Override
	public boolean forgetPassword(String login) {
		
		return false;
	}

	@Override
	public long registerUser(UserEntity user) {
		
		return 0;
	}

	@Override
	public UserEntity findByPk(UserEntity user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserEntity> search(UserEntity user, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity authenicate(UserEntity user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
