package com.capgemini.onlinetestmanagement.service;

import java.util.List;

import com.capgemini.onlinetestmanagement.pojo.Room;

public interface RoomServiceI {

	 //CRUD Operations
	 long addRoom(Room room);
	 void updateRoom(Room room);
	 void deleteRoom(Room room);
	 Room findByName(String name);
	 Room findByPk (long id);
	 
	 List<Room> search();
	
	 
	 
	 //Pagination
	 List<Room> search(Room room, long pageNo, int pageSize);
}
