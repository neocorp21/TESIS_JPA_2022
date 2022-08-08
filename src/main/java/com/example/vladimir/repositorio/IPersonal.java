package com.example.vladimir.repositorio;

import org.springframework.data.repository.CrudRepository;
 
 
import com.example.vladimir.entidades.Personal;

public interface IPersonal extends CrudRepository<Personal, Long> {

}
