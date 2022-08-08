package com.example.vladimir.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Proyecto")
public class Proyecto implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_proyecto")
	Long id;
	@Column(name = "nombre")
	String nombre;
	@Column(name = "descripcion")
	String descripcion;
	@Column(name = "presupuesto")
	Double presupuesto;
	@Column(name = "fechaInicio")
	Date fechaInicio;
	@Column(name = "fechafin")
	Date fechafin;
	@Column(name = "tieneacta")
	String tieneacta;

	public Proyecto() {
		super();
	}

	public Proyecto(Long id) {
		super();
		this.id = id;
	}

	public Proyecto(Long id, String nombre, String descripcion, Double presupuesto, Date fechaInicio, Date fechafin,
	   String tieneacta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.presupuesto = presupuesto;
		this.fechaInicio = fechaInicio;
		this.fechafin = fechafin;
		this.tieneacta = tieneacta;
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

	public Double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechafin() {
		return fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	public String getTieneacta() {
		return tieneacta;
	}

	public void setTieneacta(String tieneacta) {
		this.tieneacta = tieneacta;
	}

}
