package com.example.vladimir.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Equipo")
public class Equipo implements Serializable {

	 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_equipo")
	Long id;
	@Column(name = "nombre")
	String nombre;
	@Column(name = "descripcion")
	String descripcion;
	@ManyToOne
	@JoinColumn(name = "id_acta")
	Acta id_acta;
	
	public Equipo(Long id, String nombre, String descripcion, Acta id_acta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.id_acta = id_acta;
	}
	public Equipo() {
		super();
	}
	public Equipo(Long id) {
		super();
		this.id = id;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Acta getId_acta() {
		return id_acta;
	}
	public void setId_acta(Acta id_acta) {
		this.id_acta = id_acta;
	}
	 
	
	
	

}
