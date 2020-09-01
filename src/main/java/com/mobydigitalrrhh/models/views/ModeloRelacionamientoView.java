package com.mobydigitalrrhh.models.views;

public class ModeloRelacionamientoView {
	
	
	private Integer idModelo;
	private String nombre;
	private String descripcion;
	
	
	public ModeloRelacionamientoView() {
	
	}
	
	

	public ModeloRelacionamientoView(Integer idModelo, String nombre, String descripcion) {
		
		this.idModelo = idModelo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}



	public Integer getIdModelo() {
		return idModelo;
	}
	
	public void setIdModelo(Integer idModelo) {
		this.idModelo = idModelo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "ModeloRelacionamientoView [idModelo=" + idModelo + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ "]";
	}
	
	
	

}
