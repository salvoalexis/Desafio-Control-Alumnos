package cl.adl.controlAlumnos.impl;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cl.adl.controlAlumnos.DesafioAsociacion1Application;
import cl.adl.controlAlumnos.VO.AlumnoVO;
import cl.adl.controlAlumnos.VO.DireccionVO;
import cl.adl.controlAlumnos.model.Alumno;
import cl.adl.controlAlumnos.model.Direccion;
import cl.adl.controlAlumnos.repository.AlumnoRepository;
import cl.adl.controlAlumnos.repository.DireccionRepository;

public class DireccionServiceImpl {

	

	
	private static final Logger log = LoggerFactory.getLogger(DesafioAsociacion1Application.class);
	
	@Autowired
	DireccionRepository dao;
	
	DireccionVO respuesta;
	
	
	@Override
	@Transactional
	public DireccionVO add(Direccion direccion) {
	
		//para enviar los mensaje
		
				respuesta = new DireccionVO(new ArrayList <Direccion>(), " Ha ocurrido un error", "104",null);
				
				try {
					
					dao.save(direccion);
					respuesta.setMensaje(String.format("Se ha guardado correctamente la Direccion %s", direccion.getCalle()));
					respuesta.setCodigo("0");
				}catch(Exception e) {
					
					log.trace("Direccion Service: error al guardar Direccion");
				}
				
				return respuesta;
			
	}
	
	@Override
	@Transactional(readOnly=true)
	public DireccionVO getAllDireccion() {
		
		respuesta = new DireccionVO(new ArrayList<Direccion>(), "Ha ocurrido u error", "102", null);
		try {
			ArrayList<Direccion> direccion = (ArrayList<Direccion>)dao.findAll();
			respuesta.setDireccion(direccion);
			respuesta.setMensaje(String.format("Se encontraron %d registro/s", respuesta.getDireccion().size()));
		}catch(Exception e) {
			log.trace("Direccion Service: Error en método getAllDireccion", e);
		}
		return respuesta;

	
	}
	
	
	
}
