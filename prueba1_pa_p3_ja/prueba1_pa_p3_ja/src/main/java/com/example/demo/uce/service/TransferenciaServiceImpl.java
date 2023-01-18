package com.example.demo.uce.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.CuentaBancaria;
import com.example.demo.uce.repository.ICuentaBancariaRepo;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {
	@Autowired
	private ICuentaBancariaRepo iCuentaBancariaRepo;
	
	@Override
	public void crear(String cuentaOrigen, String cuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		//Origen
		BigDecimal monto1 = monto;
	BigDecimal comision = monto.multiply(new BigDecimal(0.5));
	CuentaBancaria cOrigen = this.iCuentaBancariaRepo.buscar(cuentaOrigen);
	BigDecimal saldoOrigen = cOrigen.getSaldo();
	saldoOrigen  =saldoOrigen.subtract(comision);
	cOrigen.setSaldo(saldoOrigen);
	
	//Destino
	CuentaBancaria cDestino = this.iCuentaBancariaRepo.buscar(cuentaDestino);
	cOrigen.setSaldo(new BigDecimal(500));
	BigDecimal saldoDestino = cOrigen.getSaldo();
	saldoDestino  =saldoDestino.subtract(monto);
	cDestino.setSaldo(saldoDestino);			
	}

}
