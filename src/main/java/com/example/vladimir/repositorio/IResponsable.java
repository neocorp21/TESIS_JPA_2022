package com.example.vladimir.repositorio;

 

 
import org.springframework.data.repository.CrudRepository;

import com.example.vladimir.entidades.Responsable;
 
 
public interface IResponsable extends CrudRepository<Responsable, Long> {
 
}
