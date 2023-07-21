package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.INegocio;
import com.example.demo.repository.model.Cliente;
import com.example.demo.repository.model.Negocio;

@Service
public class NegocioServiceImpl  implements INegocioService{
	
	@Autowired
	private INegocio iNegocio;
	
	@Autowired
	private INegocioService iNegocioService;

	@Override
	public void guardar(Negocio negocio) {
		// TODO Auto-generated method stub
		this.iNegocio.ingresar(negocio);
		
	}

	@Override
	public void actualizar(Negocio negocio) {
		// TODO Auto-generated method stub
		this.iNegocio.actualizar(negocio);
		
	}

	@Override
	public void borrarPorId(Integer identificacion) {
		// TODO Auto-generated method stub
		this.iNegocio.eliminarPorId(identificacion);
		
	}

	@Override
	public Negocio seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.seleccionarPorId(id);
	}

	@Override
	public List<Negocio> reporteTotal() {
		// TODO Auto-generated method stub
		return this.reporteTotal();
	}

	@Override
	public void ingresoNuevoCliente(String direcMatriz) {
		
		Cliente cliente = new Cliente();
		
		cliente.setNombre("xxxxxx");
		cliente.setApellido("yyyyyy");
		cliente.setDireccionMatriz(direcMatriz);
		
		Negocio negocio = new Negocio();
		negocio.setNombre("Mi Negocio");
		
		List<Cliente> clientes = new ArrayList<>();
		negocio.setClientes(clientes);

		this.iNegocioService.guardar(negocio);
		
	}

}
