package cl.adl.controlAlumnos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Direccion {
	
	
	@Id
	@Column(columnDefinition = "NUMERIC(19,0)")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String calle;
	private Integer numero;
	private String ciudad;
	
	
	
	public Direccion(Integer id, String calle, Integer numero, String ciudad) {
		super();
		this.id = id;
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
	}




	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getCalle() {
		return calle;
	}




	public void setCalle(String calle) {
		this.calle = calle;
	}




	public Integer getNumero() {
		return numero;
	}




	public void setNumero(Integer numero) {
		this.numero = numero;
	}




	public String getCiudad() {
		return ciudad;
	}




	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}




	@Override
	public String toString() {
		return "Direccion [id=" + id + ", calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}

	

}
