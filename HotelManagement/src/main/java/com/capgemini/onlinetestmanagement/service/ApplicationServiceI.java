package com.capgemini.onlinetestmanagement.service;

import java.util.List;

import com.capgemini.onlinetestmanagement.pojo.Application;

public interface ApplicationServiceI {

	 //CRUD Operations
	 long add(Application application);
	 void update(Application application);
	 void delete(Application application);
	 List<Application> search();
	
	 
	 Application findByName(String name);
	 Application findByPk (long id);
	 //Pagination
	 List<Application> search(Application application, long pageNo, int pageSize);
}
