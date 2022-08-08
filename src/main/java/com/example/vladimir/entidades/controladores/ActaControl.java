package com.example.vladimir.entidades.controladores;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.vladimir.entidades.Acta;
import com.example.vladimir.entidades.Cliente;
import com.example.vladimir.entidades.Proyecto;
import com.example.vladimir.entidades.Responsable;
import com.example.vladimir.interfaces.InterfacesSimple;

@Controller
@RequestMapping("/Acta")
public class ActaControl {
	String carpeta = "Acta";
	@Autowired
	private InterfacesSimple<Acta> Service;
	@Autowired
	private InterfacesSimple<Proyecto> ServiceProyecto;
	@Autowired
	private InterfacesSimple<Responsable> ServiceProyectoResponsable;
	@Autowired
	private InterfacesSimple<Cliente> ServiceProyectoCliente;

	// instanciar entidad
	Acta obj = new Acta();
	Proyecto obj1 = new Proyecto();

	@RequestMapping("/")
	public String inicio(Model model) {
		model.addAttribute("titulo", carpeta);
		model.addAttribute("entidad", obj);// agregar o modificar
		model.addAttribute("entidadProyecto", obj1);// agregar o modificar
		model.addAttribute("lista", Service.obtenerLista());
		model.addAttribute("listaProyecto", ServiceProyecto.obtenerLista());
		model.addAttribute("listaResponsable", ServiceProyectoResponsable.obtenerLista());
		model.addAttribute("listaCliente", ServiceProyectoCliente.obtenerLista());
		return "/" + carpeta + "/index";
	}

	@RequestMapping("/formulario")

	public String guardar(Acta obj) {
		Long id_acta = obj.getId();
		Proyecto id_pro = obj.getId_proyecto();
		Responsable id_responsable = obj.getId_responsable();
		Cliente id_cliente = obj.getId_cliente();
		Date fechapreparacion = new Date();
		String aprobacion = "Si";
		// acta

		// Proyecto
		Date fechaInicio = new Date();
		Date fechafin = new Date();
		Long id_proyecto = obj.getId_proyecto().getId();
		String nombre = obj.getId_proyecto().getNombre();
		String descripcion = obj.getId_proyecto().getDescripcion();
		Double presupuesto = obj.getId_proyecto().getPresupuesto();
		String tieneacta = "Si";

		Acta a = new Acta(id_acta, id_pro, id_responsable, id_cliente, fechapreparacion, aprobacion);

		Proyecto p = new Proyecto(id_proyecto, nombre, descripcion, presupuesto, fechaInicio, fechafin, tieneacta);

		ServiceProyecto.guardar(p);
		Service.guardar(a);
		return "redirect:";
	}

	@RequestMapping("/formularioAgregar")
	public String nuevo(Acta obj) {
		Service.guardar(obj);
		return "redirect:";
	}

	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		Service.eliminar(id);
		return "redirect:../";
	}

}
