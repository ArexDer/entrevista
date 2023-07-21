package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Negocio;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class NegocioRepositoryImpl implements INegocio {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Negocio negocio) {
		// TODO Auto-generated method stub
		this.entityManager.persist(negocio);
		
	}

	@Override
	public void actualizar(Negocio negocio) {
		// TODO Auto-generated method stub
		this.entityManager.merge(negocio);
		
	}

	@Override
	public void eliminarPorId(Integer identificacion) {
		
		Negocio negocioEncontrado = this.seleccionarPorId(identificacion);
		this.entityManager.remove(negocioEncontrado);
		
	}

	@Override
	public Negocio seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Negocio.class, id);
	}

	@Override
	public List<Negocio> listado() {
		
		TypedQuery<Negocio> miQuery = this.entityManager.createQuery("SELECT n from Negocio n JOIN n.clientes cl", Negocio.class);
		
		
		return miQuery.getResultList();
	}
	
}




