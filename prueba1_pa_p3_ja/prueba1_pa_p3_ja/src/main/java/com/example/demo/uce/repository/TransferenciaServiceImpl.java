package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.CuentaBancaria;
import com.example.demo.uce.modelo.Transferencia;
import com.example.demo.uce.service.ITransferenciaService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class TransferenciaServiceImpl implements ITransferenciaRepo{
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(transferencia);
	}

	@Override
	public Transferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Transferencia.class,id );
	}

	@Override
	public void eliminar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.remove(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(transferencia);
	}


}
