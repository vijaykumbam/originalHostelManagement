package com.capgemini.onlinetestmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagement.dao.WardenI;
import com.capgemini.onlinetestmanagement.pojo.Warden;

import lombok.Data;
import lombok.NoArgsConstructor;


@Service
@Data
@NoArgsConstructor
public class WardenImpl implements WardenServiceI{

	@Autowired
	private WardenI wardenDao;

	
	@Override
	public long addWarder(Warden warder) {
		long wardenId = 1;
		wardenDao.save(warder);
		return wardenId;
	}

	
	@Override
	public void updateWarder(Warden warder) {
		Optional<Warden> obj = wardenDao.findById(warder.getWardenId());
		if(obj.isPresent())
		{
			Warden warden =obj.get();
			warden.setName(warder.getName());
			wardenDao.saveAndFlush(warder);
		}
		
	}

	
	@Override
	public void deleteWarder(Warden warder) {
		Optional<Warden> obj =wardenDao.findById(warder.getWardenId());
		if(obj.isPresent())
		{
			wardenDao.delete(warder);	
		}		
	}

	
	@Override
	public Warden findByName(String name) {
		Optional<Warden>obj = wardenDao.findByName(name);
		if(obj.isPresent())
		{
			Warden warder=obj.get();
			return warder;
		}
		else
		return null;
	}

	
	@Override
	public Warden findByPk(long id) {
		Optional<Warden> obj = wardenDao.findById(id);
		if(obj.isPresent())
		{
			Warden warden =obj.get();
			return warden;
		}
		else
			return null;
	}

	
	@Override
	public List<Warden> search() {
		List<Warden> obj = wardenDao.findAll();
		if(obj.size() !=0)
			return obj;
		else		
		return null;
	}
	

	@Override
	public List<Warden> search(Warden warder, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
