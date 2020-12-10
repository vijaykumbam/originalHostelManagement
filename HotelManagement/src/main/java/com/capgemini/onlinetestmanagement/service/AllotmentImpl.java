package com.capgemini.onlinetestmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagement.dao.AllotmentI;
import com.capgemini.onlinetestmanagement.pojo.Allotment;

@Service
public class AllotmentImpl implements AllotmentServiceI{

	@Autowired
	private AllotmentI allotmentDao;
	
	
	@Override
	public long add(Allotment allotment) {
		long allotmentId = allotment.getAllotmentId();
		allotmentDao.save(allotment);
		return allotmentId;
	}

	@Override
	public void update(Allotment allotment) {
		if(allotmentDao.existsById(allotment.getAllotmentId()) == true)
		{
			allotmentDao.saveAndFlush(allotment);
		}
	}

	@Override
	public void delete(Allotment allotment) {
		Optional<Allotment> allotmentObj = allotmentDao.findById(allotment.getAllotmentId());
		if(allotmentObj.isPresent())
		{
			Allotment obj = allotmentObj.get();
			allotmentDao.delete(obj);
		}	
	}

	@Override
	public List<Allotment> search() {
		List<Allotment> obj = allotmentDao.findAll();
		if(obj.isEmpty()==false)
			return obj;
		else
		return null;
	}

	
	
	@Override
	public Allotment findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Allotment findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Allotment> search(Allotment allotment, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
