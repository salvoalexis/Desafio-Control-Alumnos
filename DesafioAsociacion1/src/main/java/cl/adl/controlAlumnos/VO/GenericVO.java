package cl.adl.controlAlumnos.VO;

public class GenericVO {
	
	private String mensaje;
	private String codigo;
	private String nombre;


	public GenericVO(String mensaje, String codigo, String nombre) {
		super();
		this.mensaje = mensaje;
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public GenericVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "GenericVO [mensaje=" + mensaje + ", codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	
	

}
