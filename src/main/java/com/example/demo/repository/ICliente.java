package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.model.Cliente;
import com.example.demo.repository.model.Negocio;

public interface ICliente {
	
	public void ingresar(Cliente cliente);

	public void actualizar(Cliente cliente);

	public void eliminarPorId(Integer id);
	
	public Cliente seleccionarPorIdentificacion(Integer id);

	public Cliente seleccionarPorNombre(String nombre);
	
	public List<String> listadoDireccion();
	
	
}
