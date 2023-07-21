package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.model.Negocio;

public interface INegocio {
	
	public void ingresar(Negocio negocio);

	public void actualizar(Negocio negocio );

	public void eliminarPorId(Integer identificacion);

	public Negocio seleccionarPorId(Integer id);
	
	public List<Negocio> listado();

}
