package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.CuentaBancaria;
import com.example.demo.uce.modelo.Transferencia;

public interface ITransferenciaRepo {
	public void insertar(Transferencia transferencia);	
	public Transferencia buscar(Integer id);
	
	public void eliminar(Transferencia transferencia);
	public void actualizar(Transferencia transferencia);
}
