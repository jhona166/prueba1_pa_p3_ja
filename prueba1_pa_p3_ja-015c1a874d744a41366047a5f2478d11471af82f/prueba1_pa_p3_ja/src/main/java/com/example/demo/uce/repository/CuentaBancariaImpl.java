package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CuentaBancariaImpl implements ICuentaBancariaRepo{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CuentaBancaria cBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cBancaria);
	}

	@Override
	public CuentaBancaria buscar(String cuenta) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaBancaria.class, cuenta);
	}

	@Override
	public void eliminar(CuentaBancaria cBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.remove(cBancaria);
	}

	@Override
	public void actualizar(CuentaBancaria cBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cBancaria);
	}

}
