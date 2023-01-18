package com.example.demo.correccion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.correccion.modelo.Cuenta;
import com.example.demo.correccion.modelo.Transferencia;
import com.example.demo.correccion.repository.ICuentaRepo;
import com.example.demo.correccion.repository.ITransferenciaRepo;
@Service
public class TransferenciaServiceImpl implements ITransferenciaService {
	@Autowired
	private ICuentaRepo iCuentaRepo;
	@Autowired
	private ITransferenciaRepo iTransferenciaRepo;
	@Override
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		//Origen
		Cuenta origen = this.iCuentaRepo.buscar(numeroDestino);
		BigDecimal comision =monto.multiply(new BigDecimal(0.05));
		BigDecimal montoDebitar =comision.add(comision) ; 
		
		BigDecimal saldoActualOrigen =origen.getSaldo();
		
		origen.setSaldo(saldoActualOrigen.subtract(montoDebitar));
		this.iCuentaRepo.actualizar(origen);
		//-1 si el de la izquierda es menor
		//1 si el de la izquierda ens mayor
		//0 si son iguales
		if(saldoActualOrigen.compareTo(montoDebitar)>=0) {
			//Origen
			origen.setSaldo(saldoActualOrigen.subtract(montoDebitar));
			this.iCuentaRepo.actualizar(origen);
			
			//Destino
			Cuenta destino = this.iCuentaRepo.buscar(numeroDestino);
			BigDecimal saldoActualDestino =destino.getSaldo();
			destino.setSaldo(saldoActualDestino.add(monto));
			this.iCuentaRepo.actualizar(destino);
			
			//Transferencia
			Transferencia transfer = new Transferencia();
			transfer.setComision(comision);
			transfer.setFecha(LocalDateTime.now());
			transfer.setMonto(monto);
			transfer.setNumeroDestino(numeroDestino);
			transfer.setNumeroOrigen(numeroOrigen);
			this.iTransferenciaRepo.insertar(transfer);
			
		}else {
			
			System.out.println("Monto no permitido");
		}
		
	
	}

}
