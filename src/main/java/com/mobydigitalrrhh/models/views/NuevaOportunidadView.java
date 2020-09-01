package com.mobydigitalrrhh.models.views;

import java.util.List;



public class NuevaOportunidadView {

	private List<EmpresaView> empresas;

	private List<ModeloRelacionamientoView> modelosRelacionamiento;

	private List<PerfiladoView> perfilados;

	private List<SeniorityView> seniority;

	public NuevaOportunidadView() {

	}

	public List<EmpresaView> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<EmpresaView> empresas) {
		this.empresas = empresas;
	}

	public List<ModeloRelacionamientoView> getModelosRelacionamiento() {
		return modelosRelacionamiento;
	}

	public void setModelosRelacionamiento(List<ModeloRelacionamientoView> modelosRelacionamiento) {
		this.modelosRelacionamiento = modelosRelacionamiento;
	}

	public List<SeniorityView> getSeniority() {
		return seniority;
	}

	public void setSeniority(List<SeniorityView> seniority) {
		this.seniority = seniority;
	}

	public List<PerfiladoView> getPerfilados() {
		return perfilados;
	}

	public void setPerfilados(List<PerfiladoView> perfilados) {
		this.perfilados = perfilados;
	}

}
