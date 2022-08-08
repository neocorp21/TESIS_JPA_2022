package com.example.vladimir.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
@Entity		
@Table(name="responsable")
public class Responsable implements Serializable  {
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_responsable")					
Long id;
@Column(name = "nombre")
String nombre;

@Column(name = "apellidopaterno")
String apellidopaterno;
@Column(name = "apellidomaterno")
String apellidomaterno;
@OneToOne
@JoinColumn(name="id_cargo")
Cargo id_cargo;
 

public Responsable(Long id) {
	super();
	this.id = id;
}


public Responsable() {
	super();
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellidopaterno() {
	return apellidopaterno;
}


public void setApellidopaterno(String apellidopaterno) {
	this.apellidopaterno = apellidopaterno;
}


public String getApellidomaterno() {
	return apellidomaterno;
}


public void setApellidomaterno(String apellidomaterno) {
	this.apellidomaterno = apellidomaterno;
}


public Cargo getId_cargo() {
	return id_cargo;
}


public void setId_cargo(Cargo id_cargo) {
	this.id_cargo = id_cargo;
}

 

 
 



}