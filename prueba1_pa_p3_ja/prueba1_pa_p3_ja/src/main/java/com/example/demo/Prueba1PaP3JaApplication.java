package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.CuentaBancaria;
import com.example.demo.uce.modelo.Transferencia;
import com.example.demo.uce.service.ICuentaBancariaService;
import com.example.demo.uce.service.ITransferenciaService;

@SpringBootApplication
public class Prueba1PaP3JaApplication implements CommandLineRunner {
	@Autowired
	private ITransferenciaService iTransferenciaService;
	@Autowired
	private ICuentaBancariaService iCuentaBancariaRepo;
	public static void main(String[] args) {
		SpringApplication.run(Prueba1PaP3JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//1
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.setNumero("11111");
		cuenta.setTipo("Ahorros");
		cuenta.setSaldo(new BigDecimal(1000));
		cuenta.setCedula("1727501510");
		this.iCuentaBancariaRepo.insertar(cuenta);		
		//2
		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta.setNumero("22222");
		cuenta.setTipo("Corriente");
		cuenta.setSaldo(new BigDecimal(2000));
		cuenta.setCedula("1727501511");
		this.iCuentaBancariaRepo.insertar(cuenta2);
		
		//3
		Transferencia trans = new Transferencia();
		//trans.setCuentaOrigen("22222");
		//trans.setDestino("11111");
		trans.setMonto(new BigDecimal(50));
		this.iTransferenciaService.crear("11111", "22222", new BigDecimal(200));
	}

}
