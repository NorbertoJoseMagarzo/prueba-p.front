package com.mobydigitalrrhh.models.services;

import java.util.List;
import com.mobydigitalrrhh.models.entities.ModeloRelacionamiento;



public interface IModeloRelacionamientoService {

	public List<ModeloRelacionamiento> listarModelosRelacionamiento();
	
	public void guardar(ModeloRelacionamiento modeloRelacionamiento);
	
	public void eliminar(Integer id);
	
	public ModeloRelacionamiento encontrarModeloRelacionamientoPorId(Integer id);
}
