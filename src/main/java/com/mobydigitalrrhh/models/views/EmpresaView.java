package com.mobydigitalrrhh.models.views;

public class EmpresaView {

	private Integer idEmpresa;
	private String nombre;

	public EmpresaView() {

	}

	public EmpresaView(Integer idEmpresa, String nombre) {

		this.idEmpresa = idEmpresa;
		this.nombre = nombre;
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "EmpresaView [idEmpresa=" + idEmpresa + ", nombre=" + nombre + "]";
	}

}
