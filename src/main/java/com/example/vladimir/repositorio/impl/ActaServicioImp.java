package com.example.vladimir.repositorio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vladimir.entidades.Acta;
 
import com.example.vladimir.interfaces.InterfacesSimple;
import com.example.vladimir.repositorio.IActa;

@Service
public class ActaServicioImp implements InterfacesSimple<Acta> {
	@Autowired
	private IActa DAO;

	@Override
	public List<Acta> obtenerLista() {
		return (List<Acta>) DAO.findAll();

	}

	@Override
	public void guardar(Acta obj) {
		DAO.save(obj);
	}

	@Override
	public void eliminar(Long id) {
		DAO.deleteById(id);
	}

 

}
