package com.example.vladimir.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "Acta")
public class Acta implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_acta")
	Long id;
	@OneToOne
	@JoinColumn(name="id_proyecto")
	Proyecto id_proyecto;
	@OneToOne
	@JoinColumn(name="id_responsable")
	Responsable id_responsable;
	
	@OneToOne
	@JoinColumn(name="id_cliente")
	Cliente id_cliente;
	
	@Column(name = "fechapreparacion")
	Date fechapreparacion;
	@Column(name = "aprobacion")
	String aprobacion;

	public Acta() {
		super();
	}

	 

	public Acta(Long id, Proyecto id_proyecto, Responsable id_responsable, Cliente id_cliente, Date fechapreparacion,
			String aprobacion) {
		super();
		this.id = id;
		this.id_proyecto = id_proyecto;
		this.id_responsable = id_responsable;
		this.id_cliente = id_cliente;
		this.fechapreparacion = fechapreparacion;
		this.aprobacion = aprobacion;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Proyecto getId_proyecto() {
		return id_proyecto;
	}



	public void setId_proyecto(Proyecto id_proyecto) {
		this.id_proyecto = id_proyecto;
	}



	public Responsable getId_responsable() {
		return id_responsable;
	}



	public void setId_responsable(Responsable id_responsable) {
		this.id_responsable = id_responsable;
	}



	public Cliente getId_cliente() {
		return id_cliente;
	}



	public void setId_cliente(Cliente id_cliente) {
		this.id_cliente = id_cliente;
	}



	public Date getFechapreparacion() {
		return fechapreparacion;
	}



	public void setFechapreparacion(Date fechapreparacion) {
		this.fechapreparacion = fechapreparacion;
	}



	public String getAprobacion() {
		return aprobacion;
	}



	public void setAprobacion(String aprobacion) {
		this.aprobacion = aprobacion;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@PrePersist
	public void registro() {
	  aprobacion="Pendiente";
	  fechapreparacion=new Date();
	}
	
	
	 
	
	
	
	
	
	
}
