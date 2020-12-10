package com.capgemini.onlinetestmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagement.dao.HostelI;
import com.capgemini.onlinetestmanagement.pojo.Hostel;

@Service
public class HostelImpl implements HostelServiceI{

	@Autowired
	private HostelI hostelDao;
	
	
	@Override
	public long addHotel(Hostel hostel) {
		long hostelId = hostel.getHostelId();
		hostelDao.save(hostel);
		return hostelId;
	}

	@Override
	public void updateHotel(Hostel hostel) {
		if(hostelDao.existsById(hostel.getHostelId()) == true)
		{
			hostelDao.saveAndFlush(hostel);
		}
	}

	@Override
	public void deleteHotel(Hostel hostel) {
		Optional<Hostel> obj = hostelDao.findById(hostel.getHostelId());
		if(obj.isPresent())
		{
			Hostel hostelObj = obj.get();
			hostelDao.delete(hostelObj);
		}
	}

	@Override
	public List<Hostel> search() {
		List<Hostel> obj = hostelDao.findAll();
		if(obj.isEmpty()!= true)
		{
			return obj;
		}
		else
		return null;
	}
	
	
	
	
	@Override
	public Hostel findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hostel findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hostel> search(Hostel hostel, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
