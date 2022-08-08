package com.example.vladimir.repositorio.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vladimir.entidades.Proyecto;
import com.example.vladimir.interfaces.InterfacesSimple;
import com.example.vladimir.repositorio.IProyecto;

 
 

@Service
public class ProyectoServicioImp implements InterfacesSimple<Proyecto> {
@Autowired
private IProyecto DAO;

	@Override
	public List<Proyecto> obtenerLista() {
		return (List<Proyecto>)DAO.findAll();
	 
	}

	@Override
	public void guardar(Proyecto obj) {
		DAO.save(obj);
		
	}

	@Override
	public void eliminar(Long id) {
		DAO.deleteById(id);
	 }

	 
 
	 

 
	
	
	 
}
