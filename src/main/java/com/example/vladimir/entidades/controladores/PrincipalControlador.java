package com.example.vladimir.entidades.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

 

@Controller
@RequestMapping("/")
public class PrincipalControlador {
	String carpeta="principal";
	@Autowired
	 
	 

	@RequestMapping("/")
	public String inicio() {
	return "/"+carpeta+"/index";
	}
}
	 