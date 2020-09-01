package com.mobydigitalrrhh.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobydigitalrrhh.models.dao.IModeloRelacionamientoDAO;
import com.mobydigitalrrhh.models.entities.ModeloRelacionamiento;


@Service
public class ModeloRelacionamientoServiceImp implements IModeloRelacionamientoService{

	@Autowired
	private IModeloRelacionamientoDAO modeloDao;
	
	@Override
	public List<ModeloRelacionamiento> listarModelosRelacionamiento() {
		return (List<ModeloRelacionamiento>) modeloDao.findAll();
	}

	@Override
	public void guardar(ModeloRelacionamiento modeloRelacionamiento) {
		modeloDao.save(modeloRelacionamiento);
	}

	@Override
	public void eliminar(Integer id) {
		modeloDao.deleteById(id);
	}

	@Override
	public ModeloRelacionamiento encontrarModeloRelacionamientoPorId(Integer id) {
		return modeloDao.findById(id).orElse(null);
	}

}
