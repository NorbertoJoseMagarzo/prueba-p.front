package com.mobydigitalrrhh.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobydigitalrrhh.models.dao.IEmpresaDAO;
import com.mobydigitalrrhh.models.entities.Empresa;

@Service
public class EmpresaServiceImp implements IEmpresaService {

	@Autowired
	private IEmpresaDAO empresaDao;
	
	@Override
	public List<Empresa> findAllEmpresa() {
		return (List<Empresa>) empresaDao.findAll();
	}

	@Override
	public Empresa findById(Integer id) {
		return empresaDao.findById(id).orElse(null);
	}

	@Override
	public void createEmpresa(Empresa empresa) {
		empresaDao.save(empresa);
	}

	@Override
	public void deleteEmpresa(Integer id) {
		empresaDao.deleteById(id);
		
	}

}
