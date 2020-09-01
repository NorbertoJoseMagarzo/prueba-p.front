package com.mobydigitalrrhh.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "modelorelacionamiento")
public class ModeloRelacionamiento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_modelo_relacionamiento")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idModeloRealcionamiento;

	private String nombre;

	private String descripcion;
	
	@OneToMany(mappedBy = "modeloRelacionamiento", fetch=FetchType.LAZY)
	private List<Busqueda> busquedas;

	public Integer getIdModeloRealcionamiento() {
		return idModeloRealcionamiento;
	}

	public void setIdModeloRealcionamiento(Integer idModeloRealcionamiento) {
		this.idModeloRealcionamiento = idModeloRealcionamiento;
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

	
	
	public List<Busqueda> getBusquedas() {
		return busquedas;
	}

	public void setBusquedas(List<Busqueda> busquedas) {
		this.busquedas = busquedas;
	}

	@Override
	public String toString() {
		return "ModeloRelacionamiento [idModeloRealcionamiento=" + idModeloRealcionamiento + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + "]";
	}

}
