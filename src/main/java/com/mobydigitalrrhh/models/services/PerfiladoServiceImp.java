package com.mobydigitalrrhh.models.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mobydigitalrrhh.models.dao.IPerfiladoDAO;
import com.mobydigitalrrhh.models.dao.ISeniorityDAO;
import com.mobydigitalrrhh.models.entities.Perfilado;
import com.mobydigitalrrhh.models.entities.Seniority;
import com.mobydigitalrrhh.models.views.PerfiladoView;
import com.mobydigitalrrhh.models.views.SeniorityView;

@Service
public class PerfiladoServiceImp implements IPerfiladoService {

	@Autowired
	private IPerfiladoDAO perfiladoDao;
	


	@Override
	public List<Perfilado> findAllPerfiles() {
		
		return (List<Perfilado>) perfiladoDao.findAll();
	}

	@Override
	public Perfilado findById(Integer id) {
		return perfiladoDao.findById(id).orElse(null);
	}

	@Override
	public void createPerfilado(Perfilado perfilado) {
		perfiladoDao.save(perfilado);
	}

	@Override
	public void deletePerfilado(Integer id) {
		perfiladoDao.deleteById(id);
	}


   
	

	
	
	 
	 
	 
}
