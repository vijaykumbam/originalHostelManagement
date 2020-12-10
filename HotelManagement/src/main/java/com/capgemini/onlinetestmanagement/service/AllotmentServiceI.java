package com.capgemini.onlinetestmanagement.service;

import java.util.List;

import com.capgemini.onlinetestmanagement.pojo.Allotment;

public interface AllotmentServiceI {

	 //CRUD Operations
	 long add(Allotment allotment);
	 void update(Allotment allotment);
	 void delete(Allotment allotment);
	 List<Allotment> search();
	
	 
	 
	 Allotment findByName(String name);
	 Allotment findByPk (long id);
	 
	 //Pagination
	 List<Allotment> search(Allotment allotment, long pageNo, int pageSize);
}
