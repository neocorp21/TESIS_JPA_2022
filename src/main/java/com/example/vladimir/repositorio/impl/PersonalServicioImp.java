package com.example.vladimir.repositorio.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vladimir.entidades.Personal;
import com.example.vladimir.interfaces.InterfacesSimple;
import com.example.vladimir.repositorio.IPersonal;

 
 

@Service
public class PersonalServicioImp implements InterfacesSimple<Personal> {
@Autowired
private IPersonal DAO;

	@Override
	public List<Personal> obtenerLista() {
		return (List<Personal>)DAO.findAll();
	 
	}

	@Override
	public void guardar(Personal obj) {
		DAO.save(obj);
		
	}

	@Override
	public void eliminar(Long id) {
		DAO.deleteById(id);
	 }

	 
 
	 

 
	
	
	 
}
