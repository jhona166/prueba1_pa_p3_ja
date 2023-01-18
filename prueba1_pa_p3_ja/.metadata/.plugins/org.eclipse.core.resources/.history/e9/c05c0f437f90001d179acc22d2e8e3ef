package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Para decirle que un obj repr una bdd
//establecida la representacion tabla obj clase
//Representar siempre con los primitivos
//@Id representa la pk 
@Entity
@Table(name="estudiante")

public class Estudiante {
	
	@Id
	@Column(name="estu_id")
	private Integer id;
	@Column(name="estu_nombre")
	private String nombre;
	@Column(name="estu_apellido")
	private String apellido;
	@Column(name="estu_genero")
	private String genero;
	@Column(name="estu_cedula")
	private String cedula;
	@Column(name="estu_cuidad")
	private String cuidad;
	//Set and Get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getCuidad() {
		return cuidad;
	}
	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}
	
}
