package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ClienteRepositoryImpl implements ICliente {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cliente);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		Cliente cliente = this.seleccionarPorIdentificacion(id);
		this.entityManager.remove(cliente);

	}

	@Override
	public Cliente seleccionarPorIdentificacion(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cliente.class, id);
	}

	@Override
	public Cliente seleccionarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Cliente.buscaPorNombre", Cliente.class);
		myQuery.setParameter("datoNombre", nombre);

		return (Cliente) myQuery.getSingleResult();
	}

	@Override
	public List<String> listadoDireccion() {
		// TODO Auto-generated method stub
		
		TypedQuery<Cliente> myQuery = this.entityManager.createNamedQuery("Cliente.buscadirecciones", Cliente.class);
		
		return null;
	}

}
