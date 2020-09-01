package com.mobydigitalrrhh.models.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobydigitalrrhh.models.entities.Empresa;
import com.mobydigitalrrhh.models.entities.ModeloRelacionamiento;
import com.mobydigitalrrhh.models.entities.Perfilado;
import com.mobydigitalrrhh.models.entities.Seniority;
import com.mobydigitalrrhh.models.views.EmpresaView;
import com.mobydigitalrrhh.models.views.ModeloRelacionamientoView;
import com.mobydigitalrrhh.models.views.NuevaOportunidadView;
import com.mobydigitalrrhh.models.views.PerfiladoView;
import com.mobydigitalrrhh.models.views.SeniorityView;

@Service
public class InicializarVentanaService {

	@Autowired
	private IEmpresaService empresaService;

	@Autowired
	private IModeloRelacionamientoService modeloService;

	@Autowired
	private IPerfiladoService perfiladoService;

	@Autowired
	private ISeniorityService seniorityService;

	public NuevaOportunidadView nuevaOportunidad() {

		NuevaOportunidadView nuevaOportunidadView = new NuevaOportunidadView();

		nuevaOportunidadView.setModelosRelacionamiento(cargarModelos());
		nuevaOportunidadView.setEmpresas(cargarEmpresas());
		nuevaOportunidadView.setPerfilados(cargarPerfilados());
		nuevaOportunidadView.setSeniority(cargarSeniority());

		return nuevaOportunidadView;

	}

	private List<ModeloRelacionamientoView> cargarModelos() {

		List<ModeloRelacionamientoView> modelosViews = new ArrayList<>();
		List<ModeloRelacionamiento> modelos = modeloService.listarModelosRelacionamiento();

		for (ModeloRelacionamiento modeloRelacionamiento : modelos) {

			ModeloRelacionamientoView modeloView = new ModeloRelacionamientoView(
					modeloRelacionamiento.getIdModeloRealcionamiento(), modeloRelacionamiento.getNombre(),
					modeloRelacionamiento.getDescripcion());
			modelosViews.add(modeloView);
		}

		return modelosViews;

	}

	private List<EmpresaView> cargarEmpresas() {

		List<EmpresaView> empresasViews = new ArrayList<>();
		List<Empresa> empresas = empresaService.findAllEmpresa();

		for (Empresa empresa : empresas) {
			EmpresaView empresaView = new EmpresaView(empresa.getIdEmpresa(), empresa.getNombre());
			empresasViews.add(empresaView);
		}
		return empresasViews;

	}

	public List<PerfiladoView> cargarPerfilados() {

		List<Perfilado> listaPerfiles = new ArrayList<>();
		List<PerfiladoView> listaPerfiladoView = new ArrayList<>();

		listaPerfiles = (List<Perfilado>) perfiladoService.findAllPerfiles();
		for (Perfilado perfilado : listaPerfiles) {
			PerfiladoView perfiladoview = new PerfiladoView();

			perfiladoview.setIdPerfilado(perfilado.getIdPerfilado());
			perfiladoview.setNombre(perfilado.getNombre());
			listaPerfiladoView.add(perfiladoview);
		}
		return listaPerfiladoView;

	}

	public List<SeniorityView> cargarSeniority() {

		List<SeniorityView> senioritysViews = new ArrayList<>();
		List<Seniority> senioritys = seniorityService.findAllSeniority();
		for (Seniority seniority : senioritys) {
			SeniorityView seniorityView = new SeniorityView(seniority.getIdSeniority(), seniority.getDescripcion());
			senioritysViews.add(seniorityView);
		}
		return senioritysViews;

	}

}
