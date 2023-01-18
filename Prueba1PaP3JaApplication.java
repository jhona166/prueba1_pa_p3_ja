package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.correccion.modelo.Cuenta;
import com.example.demo.correccion.service.ICuentaService;
import com.example.demo.correccion.service.ITransferenciaService;

@SpringBootApplication
public class Prueba1PaP3JaApplication implements CommandLineRunner {
	@Autowired
	private ICuentaService iCuentaService; ;
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Prueba1PaP3JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//1
		Cuenta cuentaOrigen = new Cuenta();
		cuentaOrigen.setNumero("132");
		cuentaOrigen.setTipo("A");
		cuentaOrigen.setSaldo(new BigDecimal(100));
		cuentaOrigen.setCedulaPropietario("1727501510");
	
		this.iCuentaService.guardar(cuentaOrigen);		
		
		Cuenta cuentaDestino= new Cuenta();
		cuentaDestino.setNumero("133");
		cuentaDestino.setTipo("A");
		cuentaDestino.setSaldo(new BigDecimal(200));
		cuentaDestino.setCedulaPropietario("1727501511");
	
		this.iCuentaService.guardar(cuentaDestino);		
		
		this.iTransferenciaService.realizar("132", "133", new BigDecimal(10));
		System.out.println("El saldo actual es: ");
		System.out.println(this.iCuentaService.encontrar("132").getSaldo());
		
	}

}
