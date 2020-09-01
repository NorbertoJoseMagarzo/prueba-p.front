package com.mobydigitalrrhh.models.services;

import java.util.List;

import com.mobydigitalrrhh.models.entities.Empresa;

public interface IEmpresaService {

	public List<Empresa> findAllEmpresa();

	public Empresa findById(Integer id);

	public void createEmpresa(Empresa empresa);

	public void deleteEmpresa(Integer id);

	
}