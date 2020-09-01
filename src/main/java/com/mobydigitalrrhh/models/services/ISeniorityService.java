package com.mobydigitalrrhh.models.services;

import java.util.List;


import com.mobydigitalrrhh.models.entities.Seniority;

public interface ISeniorityService {
	

	
	public List<Seniority> findAllSeniority();

	public Seniority findById(Integer id);

	public void createSeniority(Seniority seniority);

	public void deleteSeniority(Integer id);

}
