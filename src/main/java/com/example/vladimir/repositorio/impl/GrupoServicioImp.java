package com.example.vladimir.repositorio.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vladimir.entidades.Grupo;
import com.example.vladimir.interfaces.InterfacesSimple;
import com.example.vladimir.repositorio.IGrupo;

 
 

@Service
public class GrupoServicioImp implements InterfacesSimple<Grupo> {
@Autowired
private IGrupo DAO;

	@Override
	public List<Grupo> obtenerLista() {
		return (List<Grupo>)DAO.findAll();
	 
	}

	@Override
	public void guardar(Grupo obj) {
		DAO.save(obj);
		
	}

	@Override
	public void eliminar(Long id) {
		DAO.deleteById(id);
	 }

	 
 
	 

 
	
	
	 
}
