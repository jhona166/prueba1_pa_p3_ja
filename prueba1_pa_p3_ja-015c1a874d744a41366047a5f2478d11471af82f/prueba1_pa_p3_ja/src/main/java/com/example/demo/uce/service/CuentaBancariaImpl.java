package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.CuentaBancaria;
import com.example.demo.uce.repository.ICuentaBancariaRepo;
@Service
public class CuentaBancariaImpl implements ICuentaBancariaService{
@Autowired
private ICuentaBancariaRepo iCuentaBancariaRepo;

	@Override
	public void insertar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepo.insertar(cuenta);
	}
	
	

}
