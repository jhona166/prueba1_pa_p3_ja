package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.CuentaBancaria;

public interface ICuentaBancariaRepo {
		public void insertar(CuentaBancaria cBancaria);	
		public CuentaBancaria buscar(String cuenta);
		public void eliminar(CuentaBancaria cBancaria);
		public void actualizar(CuentaBancaria cBancaria);
		
		
}
