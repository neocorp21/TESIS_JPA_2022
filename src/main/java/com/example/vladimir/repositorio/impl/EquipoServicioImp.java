package com.example.vladimir.repositorio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vladimir.entidades.Equipo;
import com.example.vladimir.interfaces.InterfacesSimple;
import com.example.vladimir.repositorio.IEquipo;

@Service
public class EquipoServicioImp implements InterfacesSimple<Equipo> {
	@Autowired
	private IEquipo DAO;

	@Override
	public List<Equipo> obtenerLista() {
		return (List<Equipo>) DAO.findAll();

	}

	@Override
	public void guardar(Equipo obj) {
		DAO.save(obj);
	}

	@Override
	public void eliminar(Long id) {
		DAO.deleteById(id);
	}

 

}
