package cl.adl.controlAlumnos.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Alumno {

	@Id
	@Column(columnDefinition = "NUMERIC(19,0)")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer rut;
	private String nombre;
	private String apellido;
	private String email;
	private Integer edad;
	private Integer fecha_ingreso;
	@OneToOne(cascade=CascadeType.ALL) //1:1
	@JoinColumn(name="direccion_id", referencedColumnName="id")
	private Direccion direccion;

	
	
	
	
	
	
	public Alumno(Integer id, Integer rut, String nombre, String apellido, String email, Integer edad,
			Integer fecha_ingreso, Direccion direccion) {
		super();
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.edad = edad;
		this.fecha_ingreso = fecha_ingreso;
		this.direccion = direccion;
	}



	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getRut() {
		return rut;
	}



	public void setRut(Integer rut) {
		this.rut = rut;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Integer getEdad() {
		return edad;
	}



	public void setEdad(Integer edad) {
		this.edad = edad;
	}



	public Integer getFecha_ingreso() {
		return fecha_ingreso;
	}



	public void setFecha_ingreso(Integer fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}



	public Direccion getDireccion() {
		return direccion;
	}



	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}



	@Override
	public String toString() {
		return "Alumno [id=" + id + ", rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", email="
				+ email + ", edad=" + edad + ", fecha_ingreso=" + fecha_ingreso + ", direccion=" + direccion + "]";
	}
	
	

	
	
	
}
