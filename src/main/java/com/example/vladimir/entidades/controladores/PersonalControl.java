package com.example.vladimir.entidades.controladores;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.vladimir.entidades.Cargo;
import com.example.vladimir.entidades.Personal;
import com.example.vladimir.interfaces.InterfacesSimple;

 

@Controller
@RequestMapping("/Personal")
public class PersonalControl {
	String carpeta="Personal";
	@Autowired
	private  InterfacesSimple<Personal> Service;
	@Autowired
	private  InterfacesSimple<Cargo> ServiceCargo;
	
	//instanciar entidad
	Personal obj=new Personal();
	 
	@RequestMapping("/")
	public String inicio( Model model  ) {
	model.addAttribute("titulo",carpeta); 
	model.addAttribute("entidad", obj);//agregar o modificar
	 
    model.addAttribute("lista", Service.obtenerLista()); 
    model.addAttribute("listaCargo", ServiceCargo.obtenerLista()); 
	return "/"+carpeta+"/index";
	}
	
	@RequestMapping("/formulario")
	public String guardar(Personal  obj) {
		Service.guardar(obj);
		return "redirect:";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		Service.eliminar(id);
		return "redirect:../";
	}
	
}
	 