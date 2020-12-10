package com.capgemini.onlinetestmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagement.dao.FeeI;
import com.capgemini.onlinetestmanagement.pojo.Fee;

@Service
public class FeeImpl implements FeeServiceI{

	@Autowired
	private FeeI feeDao;
	
	@Override
	public long add(Fee fee) {
		long feeId = fee.getFeeId();
		feeDao.save(fee);
		return feeId;
	}

	@Override
	public void update(Fee fee) {
		if(feeDao.existsById(fee.getFeeId()) == true)
		{
			feeDao.saveAndFlush(fee);
		}
	}

	@Override
	public void delete(Fee fee) {
		Optional<Fee> obj = feeDao.findById(fee.getFeeId());
		if(obj.isPresent())
		{
			Fee feeObj = obj.get();
			feeDao.delete(feeObj);
		}
	}

	@Override
	public List<Fee> search() {
		List<Fee> obj = feeDao.findAll();
		if(obj.isEmpty()!= true)
		{
			return obj;
		}
		else
		return null;
	}
	
	
	
	@Override
	public Fee findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fee findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fee> search(Fee fee, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
