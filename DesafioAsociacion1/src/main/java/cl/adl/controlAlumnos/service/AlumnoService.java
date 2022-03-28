package cl.adl.controlAlumnos.service;

import cl.adl.controlAlumnos.VO.AlumnoVO;
import cl.adl.controlAlumnos.model.Alumno;



public interface AlumnoService {
	
	// ********** AGREGAR *********************//
	public AlumnoVO add(Alumno alumno);
	
	// ********** CONSULTA TODOS LOS DATOS **//
	public AlumnoVO getAllAlumno();
}
