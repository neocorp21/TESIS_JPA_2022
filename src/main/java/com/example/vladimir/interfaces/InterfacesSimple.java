package com.example.vladimir.interfaces;

import java.util.List;

public interface InterfacesSimple<T> {
public List<T> obtenerLista();
public void guardar(T obj);
public void eliminar(Long id);
 
}
