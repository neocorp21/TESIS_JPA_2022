package com.example.vladimir.entidades.controladores;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.vladimir.entidades.Equipo;
import com.example.vladimir.entidades.Grupo;
import com.example.vladimir.entidades.Personal;
import com.example.vladimir.interfaces.InterfacesSimple;

 

@Controller
@RequestMapping("/Grupo")
public class GrupoControl {
	String carpeta="Grupo";
	
	@Autowired
	private  InterfacesSimple<Grupo> Service;			
	@Autowired
	private  InterfacesSimple<Equipo> ServiceEquipo;	
	@Autowired
	private  InterfacesSimple<Personal> ServicePersonal;	
	
	//instanciar entidad
	Grupo obj=new Grupo();
	
	@RequestMapping("/")
	public String inicio( Model model  ) {
	model.addAttribute("titulo",carpeta); 
	model.addAttribute("entidad", obj);//agregar o modificar
    model.addAttribute("lista", Service.obtenerLista()); 
    model.addAttribute("listaEquipo", ServiceEquipo.obtenerLista()); 
    model.addAttribute("listaPersonal", ServicePersonal.obtenerLista()); 
	return "/"+carpeta+"/index";
	}
	
	@RequestMapping("/formulario")
	public String guardar(Grupo obj) {
		Service.guardar(obj);
		return "redirect:";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		Service.eliminar(id);
		return "redirect:../";
	}
	
}
	 