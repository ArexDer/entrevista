package com.example.demo.repository.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "negocio")
public class Negocio {
	
	@Id
	@GeneratedValue(generator = "seq_negocio", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_negocio", sequenceName = "seq_negocio", allocationSize = 1)
	@Column(name = "neg_id")
	private Integer id;
	
	@Column(name = "neg_id")
	private String nombre; //Mi Negocio
	
	@OneToMany(mappedBy = "negocio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Cliente> clientes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Negocio [nombre=" + nombre + ", clientes=" + clientes + ", getId()=" + getId() + ", getNombre()="
				+ getNombre() + ", getClientes()=" + getClientes() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	

}
