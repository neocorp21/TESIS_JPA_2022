package com.example.vladimir.repositorio.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.vladimir.entidades.Cargo;
import com.example.vladimir.interfaces.InterfacesSimple;
import com.example.vladimir.repositorio.ICargo;

 
 

@Service
public class CargoServicioImp implements InterfacesSimple<Cargo> {
@Autowired
private ICargo DAO;

	@Override
	public List<Cargo> obtenerLista() {
		return (List<Cargo>)DAO.findAll();
	 
	}

	@Override
	public void guardar(Cargo obj) {
		DAO.save(obj);
		
	}

	@Override
	public void eliminar(Long id) {
		DAO.deleteById(id);
	 }

	 
 
	 

 
	
	
	 
}
