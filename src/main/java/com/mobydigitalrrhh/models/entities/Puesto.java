package com.mobydigitalrrhh.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "puestos")
public class Puesto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_puesto")
	private Integer idPuesto;

	@NotBlank(message = "El campo nombre no puede estar vacío")
	private String nombre;
	
	@OneToMany(mappedBy = "puesto")
	private List<Entrevistador> entrevistadores;
	
	

	@OneToMany(mappedBy = "puesto")
	private List<PuestoPorEquipo> puestoPorEquipos;
	
	@OneToMany(mappedBy = "puesto")
	private List<ExperienciaPorPuesto> experienciaPorPuestos;
	
	public List<ExperienciaPorPuesto> getExperienciaPorPuestos() {
		return experienciaPorPuestos;
	}

	public void setExperienciaPorPuestos(List<ExperienciaPorPuesto> experienciaPorPuestos) {
		this.experienciaPorPuestos = experienciaPorPuestos;
	}

	public List<Entrevistador> getEntrevistadores() {
		return entrevistadores;
	}

	public void setEntrevistadores(List<Entrevistador> entrevistadores) {
		this.entrevistadores = entrevistadores;
	}



	public List<PuestoPorEquipo> getPuestoPorEquipos() {
		return puestoPorEquipos;
	}

	public void setPuestoPorEquipos(List<PuestoPorEquipo> puestoPorEquipos) {
		this.puestoPorEquipos = puestoPorEquipos;
	}

	public Integer getIdPuesto() {
		return idPuesto;
	}

	public void setIdPuesto(Integer idPuesto) {
		this.idPuesto = idPuesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private static final long serialVersionUID = 1L;

}
