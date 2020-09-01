package com.mobydigitalrrhh.models.views;

import java.util.List;


public class EmpresaEncargadoView {

	private String nombreEmpresa;
	
	private List<String> nombresEncargados;

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	

	public List<String> getNombresEncargados() {
		return nombresEncargados;
	}

	public void setNombresEncargados(List<String> nombreEncargado) {
		this.nombresEncargados = nombreEncargado;
	}

	@Override
	public String toString() {
		return "NuevaOportunidadView [nombreEmpresa=" + nombreEmpresa + "]";
	}
	
	
}
