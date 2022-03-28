package cl.adl.controlAlumnos.VO;

import java.util.List;

import cl.adl.controlAlumnos.model.Direccion;

public class DireccionVO extends GenericVO {
	
	List<Direccion> direccion;

	
	public DireccionVO() {
		super();
	
	}
	public DireccionVO(List<Direccion> direccion, String mensaje, String codigo, String nombre) {
		super(mensaje, codigo, nombre);
		this.direccion = direccion;
	
	}
	public List<Direccion> getDireccion() {
		return direccion;
	}
	public void setDireccion(List<Direccion> direccion) {
		this.direccion = direccion;
	}
	
	
	@Override
	public String toString() {
		return "DireccionVO [direccion=" + direccion + "]";
	}
	
	
	

}
