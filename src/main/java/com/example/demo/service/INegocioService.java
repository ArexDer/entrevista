package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.model.Negocio;

public interface INegocioService {
	
	public void guardar(Negocio negocio);

	public void actualizar(Negocio negocio );

	public void borrarPorId(Integer identificacion);

	public Negocio seleccionarPorId(Integer id);
	
	public List<Negocio> reporteTotal();
	
	public void ingresoNuevoCliente(String direcMatriz);

}
