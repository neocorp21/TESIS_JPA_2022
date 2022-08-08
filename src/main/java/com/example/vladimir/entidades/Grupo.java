package com.example.vladimir.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "grupo")

public class Grupo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_grupo")
	Long id;
	@OneToOne
	@JoinColumn(name = "id_equipo")
	Equipo id_equipo;
	@OneToOne
	@JoinColumn(name = "id_personal")
	Personal id_personal;

	public Grupo() {
		super();
	}

	public Grupo(Long id) {
		super();
		this.id = id;

	}

	public Grupo(Long id, Equipo id_equipo, Personal id_personal) {
		super();
		this.id = id;
		this.id_equipo = id_equipo;
		this.id_personal = id_personal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Equipo getId_equipo() {
		return id_equipo;
	}

	public void setId_equipo(Equipo id_equipo) {
		this.id_equipo = id_equipo;
	}

	public Personal getId_personal() {
		return id_personal;
	}

	public void setId_personal(Personal id_personal) {
		this.id_personal = id_personal;
	}

}
