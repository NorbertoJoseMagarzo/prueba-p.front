package com.mobydigitalrrhh.models.views;

public class SeniorityView {

	private Integer idSeniority;
	private String descripcion;

	public SeniorityView() {

	}

	public SeniorityView(Integer idSeniority, String descripcion) {

		this.idSeniority = idSeniority;
		this.descripcion = descripcion;
	}

	public Integer getIdSeniority() {
		return idSeniority;
	}

	public void setIdSeniority(Integer idSeniority) {
		this.idSeniority = idSeniority;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
