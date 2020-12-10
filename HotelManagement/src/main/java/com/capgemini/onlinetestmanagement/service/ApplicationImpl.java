package com.capgemini.onlinetestmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagement.dao.ApplicationI;
import com.capgemini.onlinetestmanagement.pojo.Application;

@Service
public class ApplicationImpl implements ApplicationServiceI{

	@Autowired
	private ApplicationI applicationDao;
	
	@Override
	public long add(Application application) {
		long applicationId = application.getApplicationId();
		applicationDao.save(application);
		return applicationId;
	}

	@Override
	public void update(Application application) {
		if(applicationDao.existsById(application.getApplicationId()) == true)
		{
			applicationDao.saveAndFlush(application);
		}
		
	}

	@Override
	public void delete(Application application) {
		Optional<Application> obj = applicationDao.findById(application.getApplicationId());
		if(obj.isPresent())
		{
			Application applicationObj = obj.get();
			applicationDao.delete(applicationObj);
		}
	}

	@Override
	public List<Application> search() {
		List<Application> obj = applicationDao.findAll();
		if(obj.isEmpty()!= true)
		{
			return obj;
		}
		else
		return null;
	}

	
	
	
	
	@Override
	public Application findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Application findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Application> search(Application application, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
