package com.capgemini.onlinetestmanagement.service;

import java.util.List;

import com.capgemini.onlinetestmanagement.pojo.Hostel;

public interface HostelServiceI {

	 //CRUD Operations
	 long addHotel(Hostel hostel);
	 void updateHotel(Hostel hostel);
	 void deleteHotel(Hostel hostel);
	 Hostel findByName(String name);
	 Hostel findByPk (long id);
	 
	 List<Hostel> search();
	
	 
	 
	 //Pagination
	 List<Hostel> search(Hostel hostel, long pageNo, int pageSize);
}
