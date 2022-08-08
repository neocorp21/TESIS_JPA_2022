package com.example.vladimir.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "actividad")
public class Actividad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_actividad")
	Long id;
	@Column(name = "nombre")
	String nombre;
	@OneToOne
	@JoinColumn(name = "id_equipo")
	Equipo id_equipo;
	@Column(name = "fechainicio")
	Date fechainicio;
	@Column(name = "fechafin")
	Date fechafin;
	@Column(name = "estado")
	String estado;

	public Actividad() {
		super();
	}

	public Actividad(Long id, String nombre, Equipo id_equipo, Date fechainicio, Date fechafin, String estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.id_equipo = id_equipo;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.estado = estado;
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

	public Equipo getId_equipo() {
		return id_equipo;
	}

	public void setId_equipo(Equipo id_equipo) {
		this.id_equipo = id_equipo;
	}

	public Date getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public Date getFechafin() {
		return fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
