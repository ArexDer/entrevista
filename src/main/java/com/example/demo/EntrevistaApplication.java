package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.model.Cliente;
import com.example.demo.repository.model.Negocio;
import com.example.demo.service.INegocioService;

@SpringBootApplication
public class EntrevistaApplication implements CommandLineRunner {
	
	@Autowired
	private INegocioService iNegocioService;

	public static void main(String[] args) {
		SpringApplication.run(EntrevistaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * De ante mano gracias por la oportunidad
		 
		 * 
		 */
		
		/*
		 * INGRESO MI CLIENTE
		 */
		Cliente cliente = new Cliente();
		cliente.setNombre("aaa");
		cliente.setApellido("bbb");
		cliente.setDireccionMatriz("Principal");
		
		/*
		 * INGRESO MI NEGOCIO
		 */
		Negocio negocio = new Negocio();
		negocio.setNombre("Mi Negocio");
		
		List<Cliente> clientes = new ArrayList<>();
		negocio.setClientes(clientes);

		/*
		 * INGRESO MI CLIENTE EN LA LISTA DE "MI NEGOCIO"
		 * PARA ESTE CASO USE UNA ANOTACION OneToMany
		 */
		this.iNegocioService.guardar(negocio);
		
		
		
		
		
	}

}
