package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cuenta_bancaria")
public class Transferencia {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="transfe_seq")
	@SequenceGenerator(name="transfe_seq",sequenceName = "transfe_seq",allocationSize = 1)
	@Column(name="Id")
	private Integer Id;
	@Column(name="fecha_transferencia")
	private LocalDateTime fecha;
	@Column(name="cuenta_origen")
	private String cuentaOrigen;
	@Column(name="cuenta_destino")
	private String destino;
	@Column(name="monto_transferencia")
	private BigDecimal monto;
	@Column(name="comision")
	private BigDecimal comision;
//Set and Get
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getCuentaOrigen() {
		return cuentaOrigen;
	}
	public void setCuentaOrigen(String cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public BigDecimal getComision() {
		return comision;
	}
	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}
	

}
