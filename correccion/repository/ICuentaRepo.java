package com.example.demo.correccion.repository;

import com.example.demo.correccion.modelo.Cuenta;

public interface ICuentaRepo {
	//Crud
	
	public void insertar(Cuenta cuenta);
	public void actualizar(Cuenta cuenta);
	public Cuenta buscar(String numero);
	public void eliminar(String numero);
}
