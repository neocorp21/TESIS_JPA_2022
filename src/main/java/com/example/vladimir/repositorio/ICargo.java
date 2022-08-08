package com.example.vladimir.repositorio;

 
import org.springframework.data.repository.CrudRepository;
 
import com.example.vladimir.entidades.Cargo;

public interface ICargo extends CrudRepository<Cargo, Long> {
	 
}
