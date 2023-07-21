package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICliente;
import com.example.demo.repository.model.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private ICliente cliente;

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.cliente.ingresar(cliente);
		
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.cliente.actualizar(cliente);
		
	}

	@Override
	public void borrarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.cliente.eliminarPorId(id);
		
	}

	@Override
	public Cliente seleccionarPorIdentificacion(Integer id) {
		// TODO Auto-generated method stub
		return this.seleccionarPorIdentificacion(id);
	}

	@Override
	public Cliente seleccionarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.seleccionarPorNombre(nombre);
	}

	@Override
	public void editarDatosClienteporNombre(String nombre, String apellido, String direcMatriz, String identificacion,
			String sucursal) {
		
		
		Cliente cliente = this.cliente.seleccionarPorNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setNombre(nombre);
		cliente.setDireccionMatriz(direcMatriz);
		List<String> sucur = new ArrayList<>();
		sucur.add(sucursal);
		cliente.setSucursales(sucur);
		
		this.cliente.actualizar(cliente);
		
		
	}

	@Override
	public void nuevaDireccionCliente(String nombre, String nuevaDireccion) {
		// TODO Auto-generated method stub
		Cliente cliente = this.cliente.seleccionarPorNombre(nombre);
		cliente.setDireccionMatriz(nuevaDireccion);
		
		this.cliente.actualizar(cliente);
		
	}

}
