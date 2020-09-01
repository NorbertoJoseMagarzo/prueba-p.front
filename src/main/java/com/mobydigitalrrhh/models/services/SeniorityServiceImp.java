package com.mobydigitalrrhh.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobydigitalrrhh.models.dao.ISeniorityDAO;
import com.mobydigitalrrhh.models.entities.Seniority;


@Service
public class SeniorityServiceImp implements  ISeniorityService{

	@Autowired
	private ISeniorityDAO seniorityDao;
	
	@Override
	public List<Seniority> findAllSeniority() {
	
		return (List<Seniority>) seniorityDao.findAll();
	}

	@Override
	public Seniority findById(Integer id) {
		return seniorityDao.findById(id).orElse(null);
	}

	@Override
	public void createSeniority(Seniority seniority) {
		seniorityDao.save( seniority);
	}

	@Override
	public void deleteSeniority(Integer id) {
		seniorityDao.deleteById(id);
	}

}
