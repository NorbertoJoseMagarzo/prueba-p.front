package com.mobydigitalrrhh.models.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobydigitalrrhh.models.dao.ICandidatoDAO;
import com.mobydigitalrrhh.models.entities.Candidato;

@Service
public class CandidatoServiceImp implements ICandidatoService{

	@Autowired
	private ICandidatoDAO candidatoDao;
	
	@Override
	public List<Candidato> findAllCandidatos() {
		return (List<Candidato>) candidatoDao.findAll();
	}

	
}
