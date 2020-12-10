package com.capgemini.onlinetestmanagement.service;

import java.util.List;

import com.capgemini.onlinetestmanagement.pojo.Fee;

public interface FeeServiceI {

	 //CRUD Operations
	 long add(Fee fee);
	 void update(Fee fee);
	 void delete(Fee fee);
	 Fee findByName(String name);
	 Fee findByPk (long id);
	 
	 List<Fee> search();
	
	 
	 
	 //Pagination
	 List<Fee> search(Fee fee, long pageNo, int pageSize);
}
