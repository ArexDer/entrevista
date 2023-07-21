package com.example.demo.service;

import com.example.demo.repository.model.Cliente;

public interface IClienteService {
	
	public void guardar(Cliente cliente);

	public void actualizar(Cliente cliente);

	public void borrarPorId(Integer id);
	
	public Cliente seleccionarPorIdentificacion(Integer id);

	public Cliente seleccionarPorNombre(String nombre);
	
	public void editarDatosClienteporNombre(String nombre, String apellido, String direcMatriz, String identificacion, String sucursal);
	

	public void nuevaDireccionCliente(String nombre, String nuevaDireccion);

}
