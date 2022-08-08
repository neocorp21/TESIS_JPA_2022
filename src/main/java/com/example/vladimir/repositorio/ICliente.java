package com.example.vladimir.repositorio;

 

 
import org.springframework.data.repository.CrudRepository;

 
import com.example.vladimir.entidades.Cliente;
 
 
 
public interface ICliente extends CrudRepository<Cliente, Long> {
 
}
