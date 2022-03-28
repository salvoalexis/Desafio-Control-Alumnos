package cl.adl.controlAlumnos.VO;

import java.util.List;

import cl.adl.controlAlumnos.model.Alumno;

public class AlumnoVO extends GenericVO {
	
	List<Alumno> alumno;

// ********constructor *****************
	public AlumnoVO() {
		super();

	}
 
	
	
	// ********constructor 2*****************
	public AlumnoVO(  List<Alumno> alumno, String mensaje, String codigo, String nombre) {
		super(mensaje, nombre, codigo);
		this.alumno = alumno;
	
	}

	public List<Alumno> getAlumno() {
		return alumno;
	}

	public void setAlumno(List<Alumno> alumno) {
		this.alumno = alumno;
	}

	
	
	@Override
	public String toString() {
		return "AlumnoVO [alumno=" + alumno + "]";
	}
	
	

}
