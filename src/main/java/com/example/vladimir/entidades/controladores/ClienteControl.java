package com.example.vladimir.entidades.controladores;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.vladimir.entidades.Cliente;
import com.example.vladimir.interfaces.InterfacesSimple;

 

@Controller
@RequestMapping("/Cliente")
public class ClienteControl {
	String carpeta="Cliente";
	@Autowired
	private  InterfacesSimple<Cliente> Service;			
	 
	//instanciar entidad
	Cliente obj=new Cliente();
	
	@RequestMapping("/")
	public String inicio( Model model  ) {
	model.addAttribute("titulo",carpeta); 
	model.addAttribute("entidad", obj);//agregar o modificar
    model.addAttribute("lista", Service.obtenerLista()); 
	return "/"+carpeta+"/index";
	}
	
	@RequestMapping("/formulario")
	public String guardar(Cliente obj) {
		Service.guardar(obj);
		return "redirect:";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		Service.eliminar(id);
		return "redirect:../";
	}
	
}
	 