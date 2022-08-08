package com.example.vladimir.entidades.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.vladimir.entidades.Actividad;
import com.example.vladimir.entidades.Equipo;
import com.example.vladimir.interfaces.InterfacesSimple;

@Controller
@RequestMapping("/Actividad")
public class ActividadControl {
	String carpeta = "Actividad";
	@Autowired
	private InterfacesSimple<Actividad> Service;
	@Autowired
	private InterfacesSimple<Equipo> ServiceEquipo;
	// instanciar entidad
	Actividad obj = new Actividad();

	@RequestMapping("/")
	public String inicio(Model model) {
		model.addAttribute("titulo", carpeta);
		model.addAttribute("entidad", obj);// agregar o modificar
		model.addAttribute("lista", Service.obtenerLista());
		model.addAttribute("listaEquipo", ServiceEquipo.obtenerLista());
		return "/" + carpeta + "/index";
	}
	 
	@RequestMapping("/formulario")

	public String guardar(Actividad obj) {
		Service.guardar(obj);
		return "redirect:";
	}
	@RequestMapping("/asociar/{id}")
	public String asociar(@PathVariable(value = "id") Long id,Model model) {
		model.addAttribute("titulo", id);
		
		return "/" + carpeta + "/asociar";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		Service.eliminar(id);
		return "redirect:../";
	}

}
