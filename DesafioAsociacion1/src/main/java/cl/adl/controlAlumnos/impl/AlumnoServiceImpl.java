package cl.adl.controlAlumnos.impl;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cl.adl.controlAlumnos.DesafioAsociacion1Application;
import cl.adl.controlAlumnos.VO.AlumnoVO;
import cl.adl.controlAlumnos.model.Alumno;
import cl.adl.controlAlumnos.repository.AlumnoRepository;
import cl.adl.controlAlumnos.service.AlumnoService;


@Service
public class AlumnoServiceImpl implements AlumnoService {

	
	
	private static final Logger log = LoggerFactory.getLogger(DesafioAsociacion1Application.class);
	
	@Autowired
	AlumnoRepository dao;
	
	AlumnoVO respuesta;
	
	
	@Override
	@Transactional
	public AlumnoVO add(Alumno alumno) {
	
		//para enviar los mensaje
		
				respuesta = new AlumnoVO(new ArrayList <Alumno>(), " Ha ocurrido un error", "104", null);
				
				try {
					
					dao.save(alumno);
					respuesta.setMensaje(String.format("Se ha guardado correctamente al Alumno %s", alumno.getNombre()));
					respuesta.setCodigo("0");
				}catch(Exception e) {
					
					log.trace("Alumno Service: error al guardar Alumno");
				}
				
				return respuesta;
			
	}
	
	@Override
	@Transactional(readOnly=true)
	public AlumnoVO getAllAlumno() {
		
		respuesta = new AlumnoVO(new ArrayList<Alumno>(), "Ha ocurrido u error", "102", null);
		try {
			ArrayList<Alumno> alumno = (ArrayList<Alumno>)dao.findAll();
			respuesta.setAlumno(alumno);
			respuesta.setMensaje(String.format("Se encontraron %d registro/s", respuesta.getAlumno().size()));
		}catch(Exception e) {
			log.trace("Alumno Service: Error en método getAllAlumno", e);
		}
		return respuesta;

	
	}
	
	
	
}
