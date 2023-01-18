package com.example.demo.uce.service;

import java.math.BigDecimal;

public interface ITransferenciaService {
	public void crear(String cuentaOrigen,String cuentaDestino,BigDecimal monto);

}
