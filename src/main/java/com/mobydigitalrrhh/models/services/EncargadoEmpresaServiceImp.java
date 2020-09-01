package com.mobydigitalrrhh.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobydigitalrrhh.models.dao.IEncargadoEmpresaDAO;
import com.mobydigitalrrhh.models.entities.EncargadoEmpresa;

@Service
public class EncargadoEmpresaServiceImp implements IEncargadoEmpresaService{

	@Autowired
	private IEncargadoEmpresaDAO encargadoDAO;
	
	@Override
	public List<EncargadoEmpresa> findAllEncargadoEmpresa() {
		return (List<EncargadoEmpresa>) encargadoDAO.findAll();
	}

	@Override
	public EncargadoEmpresa findById(Integer id) {
		return encargadoDAO.findById(id).orElse(null);
	}

	@Override
	public void createEncargadoEmpresa(EncargadoEmpresa encargadoEmpresa) {
		encargadoDAO.save(encargadoEmpresa);
	}

	@Override
	public void deleteEncargadoEmpresa(Integer id) {
		encargadoDAO.deleteById(id);
	}

}
