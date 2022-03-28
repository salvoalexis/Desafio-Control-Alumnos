package cl.adl.controlAlumnos.service;


import cl.adl.controlAlumnos.VO.DireccionVO;
import cl.adl.controlAlumnos.model.Direccion;

public interface DireccionService {
	
	
	// ********** AGREGAR *********************//
	public DireccionVO add(Direccion direccion);

	// ********** CONSULTA TODOS LOS DATOS **//
	public DireccionVO getAllDireccion();
}
