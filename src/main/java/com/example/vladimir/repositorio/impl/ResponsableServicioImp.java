package com.example.vladimir.repositorio.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vladimir.entidades.Responsable;
import com.example.vladimir.interfaces.InterfacesSimple;
import com.example.vladimir.repositorio.IResponsable;

 
 

@Service
public class ResponsableServicioImp implements InterfacesSimple<Responsable> {
@Autowired
private IResponsable DAO;

	@Override
	public List<Responsable> obtenerLista() {
		return (List<Responsable>)DAO.findAll();
	 
	}

	@Override
	public void guardar(Responsable obj) {
		DAO.save(obj);
		
	}

	@Override
	public void eliminar(Long id) {
		DAO.deleteById(id);
	 }

	 
 
	 

 
	
	
	 
}
