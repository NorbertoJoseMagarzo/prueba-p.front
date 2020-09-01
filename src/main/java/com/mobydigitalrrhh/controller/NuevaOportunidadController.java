package com.mobydigitalrrhh.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mobydigitalrrhh.models.services.InicializarVentanaService;

import com.mobydigitalrrhh.models.views.NuevaOportunidadView;

@CrossOrigin(origins = "*") // otorgamos permiso a esta URL de todas las request.
@RequestMapping(value = "/api")
@RestController
public class NuevaOportunidadController {

	@Autowired
	private InicializarVentanaService inicializarVentana;

	@GetMapping("/nuevaOportunidad")
	public ResponseEntity<NuevaOportunidadView> nuevaOportunidad() {

		try {
			return new ResponseEntity<NuevaOportunidadView>(inicializarVentana.nuevaOportunidad(), HttpStatus.OK);
		} catch (DataAccessException e) {
			e.printStackTrace(System.out);
			return new ResponseEntity<NuevaOportunidadView>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	}

}
