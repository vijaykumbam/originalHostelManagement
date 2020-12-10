package com.capgemini.onlinetestmanagement.service;

import java.util.List;

import com.capgemini.onlinetestmanagement.pojo.Warden;

public interface WardenServiceI {

	 //CRUD Operations
	 long addWarder(Warden warder);
	 void updateWarder(Warden warder);
	 void deleteWarder(Warden warder);
	 Warden findByName(String name);
	 Warden findByPk (long id);
	 
	 List<Warden> search();
	
	 
	 
	 //Pagination
	 List<Warden> search(Warden warder, long pageNo, int pageSize);
}
