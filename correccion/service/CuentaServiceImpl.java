package com.example.demo.correccion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.correccion.modelo.Cuenta;
import com.example.demo.correccion.repository.ICuentaRepo;
@Service	
public class CuentaServiceImpl implements ICuentaService {
	@Autowired
	private ICuentaRepo iCuentaRepo;
	@Override
	public void guardar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.iCuentaRepo.insertar(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.iCuentaRepo.actualizar(cuenta);
	}

	@Override
	public Cuenta encontrar(String numero) {
		// TODO Auto-generated method stub
		return this.iCuentaRepo.buscar(numero);
	}

	@Override
	public void borrar(String numero) {
		// TODO Auto-generated method stub
		this.iCuentaRepo.eliminar(numero);;
	}

}
