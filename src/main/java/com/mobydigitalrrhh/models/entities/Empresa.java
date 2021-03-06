package com.mobydigitalrrhh.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "empresas")
public class Empresa implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_empresa")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idEmpresa;

	@NotBlank(message = "El campo nombre no puede estar vacío")
	private String nombre;

	@NotBlank(message = "El campo e-mail no puede estar vacío")
	private String email;

	@NotBlank(message = "El campo teléfono no puede estar vacío")
	private String telefono;
	
	private String direccion;

	@JoinColumn(name = "id_localidad", referencedColumnName = "id_localidad")
	@ManyToOne( fetch = FetchType.LAZY)
	private Localidad localidad;

	@OneToMany(mappedBy = "empresa", fetch=FetchType.LAZY ,orphanRemoval = true)
	private List<Busqueda> busquedas;
	
	@OneToMany(mappedBy = "empresa", fetch=FetchType.LAZY)
	private List<Experiencia> experiencias;
	
	@OneToMany(mappedBy = "empresa", fetch=FetchType.LAZY)
	private List<EncargadoEmpresa> encargadoEmpresa;
	

	
	public List<EncargadoEmpresa> getEncargadoEmpresa() {
		return encargadoEmpresa;
	}

	public void setEncargadoEmpresa(List<EncargadoEmpresa> encargadoEmpresa) {
		this.encargadoEmpresa = encargadoEmpresa;
	}

	public List<Experiencia> getExperiencias() {
		return experiencias;
	}

	public void setExperiencias(List<Experiencia> experiencias) {
		this.experiencias = experiencias;
	}

	public List<Busqueda> getBusquedas() {
		return busquedas;
	}

	public void setBusquedas(List<Busqueda> busquedas) {
		this.busquedas = busquedas;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	
	
}
