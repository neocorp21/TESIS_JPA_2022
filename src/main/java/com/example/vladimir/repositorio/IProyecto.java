package com.example.vladimir.repositorio;

 

 
import org.springframework.data.repository.CrudRepository;

import com.example.vladimir.entidades.Proyecto;
 
 
public interface IProyecto extends CrudRepository<Proyecto, Long> {
	 
 
}
