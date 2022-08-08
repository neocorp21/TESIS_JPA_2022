package com.example.vladimir.repositorio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vladimir.entidades.Actividad;
import com.example.vladimir.interfaces.InterfacesSimple;
import com.example.vladimir.repositorio.IActividad;

@Service
public class ActividadServicioImp implements InterfacesSimple<Actividad> {
	@Autowired
	private IActividad DAO;

	@Override
	public List<Actividad> obtenerLista() {
		return (List<Actividad>) DAO.findAll();

	}

	@Override
	public void guardar(Actividad obj) {
		DAO.save(obj);
	}

	@Override
	public void eliminar(Long id) {
		DAO.deleteById(id);
	}

 

}
