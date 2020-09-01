package com.mobydigitalrrhh.models.services;
import java.util.List;

import com.mobydigitalrrhh.models.entities.Perfilado;



public interface IPerfiladoService {

	public List<Perfilado> findAllPerfiles();

	public Perfilado findById(Integer id);

	public void createPerfilado(Perfilado perfilado);

	public void deletePerfilado(Integer id);
	
	
	
}
