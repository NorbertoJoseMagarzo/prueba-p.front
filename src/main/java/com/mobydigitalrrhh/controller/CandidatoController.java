package com.mobydigitalrrhh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobydigitalrrhh.models.services.ICandidatoService;
import com.mobydigitalrrhh.models.services.IPerfiladoService;
import com.mobydigitalrrhh.models.services.InicializarVentanaService;
@CrossOrigin(origins =  "*") //otorgamos permiso a esta URL de todas las request.
@RequestMapping(value = "/api")
@RestController
public class CandidatoController {

	@Autowired
	private ICandidatoService candidatoService;
	
	@Autowired
	private InicializarVentanaService inicializarVentana;
	
	@GetMapping(value = "/listaPerfiles")
	public ResponseEntity<Object> listaPerfiles() {
		try {
			return new ResponseEntity<Object>(inicializarVentana.cargarPerfilados(), HttpStatus.OK);
		} catch (DataAccessException e) {
			e.printStackTrace(System.out);
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value ="/listaSeniority")
	public ResponseEntity<Object> listaSeniority(){
		try {
			return new ResponseEntity<Object>(inicializarVentana.cargarSeniority(), HttpStatus.OK);
		}
		catch (DataAccessException e) {
			e.printStackTrace(System.out);
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping(value = "/listaCandidato")
	public ResponseEntity<Object> listaCandidato(){
		try {
			return new ResponseEntity<Object>(candidatoService.findAllCandidatos(), HttpStatus.OK);
		}
		catch (DataAccessException e) {
			e.printStackTrace(System.out);
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
