package com.example.demo.repository.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@NamedQuery(name = "Cliente.buscaPorNombre", query = "SELECT c FROM Cliente c WHERE c.nombre = :datoNombre")
@NamedQuery(name = "Cliente.buscadirecciones", query = "SELECT c FROM Cliente c WHERE c.sucursales = True")
@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(generator = "seq_cliente", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente", allocationSize = 1)
	@Column(name = "clie_id")
	private Integer id;
	
	@Column(name = "clie_identificacion")
	private String identificacion;
	
	@Column(name = "clie_nombre")
	private String nombre;
	
	@Column(name = "clie_apellido")
	private String apellido;
	
	@Column(name = "clie_direccionMatriz")
	private String direccionMatriz;
	
	@Column(name = "clie_sucursales")
	private List<String> sucursales;
	
	@ManyToOne
	@JoinColumn(name = "clie_id_negocio")
	private Negocio negocio;

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
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

	public String getDireccionMatriz() {
		return direccionMatriz;
	}

	public void setDireccionMatriz(String direccionMatriz) {
		this.direccionMatriz = direccionMatriz;
	}

	public Negocio getNegocio() {
		return negocio;
	}

	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}
	
	

	public List<String> getSucursales() {
		return sucursales;
	}

	public void setSucursales(List<String> sucursales) {
		this.sucursales = sucursales;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", identificacion=" + identificacion + ", nombre=" + nombre + ", apellido="
				+ apellido + ", direccionMatriz=" + direccionMatriz + "]";
	}
	
	
	
	
	

}
