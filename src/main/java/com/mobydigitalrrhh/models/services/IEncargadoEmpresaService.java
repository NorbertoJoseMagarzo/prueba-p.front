package com.mobydigitalrrhh.models.services;

import java.util.List;

import com.mobydigitalrrhh.models.entities.EncargadoEmpresa;

public interface IEncargadoEmpresaService {

	public List<EncargadoEmpresa> findAllEncargadoEmpresa();

	public EncargadoEmpresa findById(Integer id);

	public void createEncargadoEmpresa(EncargadoEmpresa encargadoEmpresa);

	public void deleteEncargadoEmpresa(Integer id);

}
