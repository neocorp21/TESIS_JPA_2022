package com.example.vladimir.entidades.controladores;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.vladimir.entidades.Acta;
import com.example.vladimir.entidades.Equipo;
import com.example.vladimir.interfaces.InterfacesSimple;

 

@Controller
@RequestMapping("/Equipo")
public class EquipoControl {
	String carpeta="Equipo";
	@Autowired
	private  InterfacesSimple<Equipo> Service;			
	@Autowired
	private  InterfacesSimple<Acta> ServiceActa;	
	//instanciar entidad
	Equipo obj=new Equipo();
	
	@RequestMapping("/")
	public String inicio( Model model  ) {
	model.addAttribute("titulo",carpeta); 
	model.addAttribute("entidad", obj);//agregar o modificar
    model.addAttribute("lista", Service.obtenerLista()); 
    model.addAttribute("listaActa", ServiceActa.obtenerLista()); 
	return "/"+carpeta+"/index";
	}
	
	@RequestMapping("/formulario")
	public String guardar(Equipo obj) {
		Service.guardar(obj);
		return "redirect:";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		Service.eliminar(id);
		return "redirect:../";
	}
	
}
	 