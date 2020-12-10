package com.capgemini.onlinetestmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagement.dao.RoomI;
import com.capgemini.onlinetestmanagement.pojo.Room;

@Service
public class RoomImpl implements RoomServiceI{

	@Autowired
	private RoomI roomDao;
	
	
	
	@Override
	public long addRoom(Room room) {
		long roomId = room.getHostelId();
		roomDao.save(room);
		return roomId;
	}

	@Override
	public void updateRoom(Room room) {
		if(roomDao.existsById(room.getHostelId()) == true)
		{
			roomDao.saveAndFlush(room);
		}
	}

	@Override
	public void deleteRoom(Room room) {
		Optional<Room> obj = roomDao.findById(room.getHostelId());
		if(obj.isPresent())
		{
			Room roomObj = obj.get();
			roomDao.delete(roomObj);
		}
	}

	@Override
	public List<Room> search() {
		List<Room> obj = roomDao.findAll();
		if(obj.isEmpty()!= true)
		{
			return obj;
		}
		else
		return null;
	}
	
	
	
	
	
	@Override
	public Room findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Room> search(Room room, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
