package com.empresa.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Alumno;
import com.empresa.service.AlumnoService;

@RestController
@RequestMapping("/url/alumno")
public class AlumnoController {
	
	@Autowired
	private AlumnoService service;
	
	@GetMapping("/listaPorPK/{id}")
	public List<Alumno> listaPorPK(@PathVariable int id){
		return service.listaPorPK(id);
	}
		
	@GetMapping("/listaPorDNI/{dni}")
	public List<Alumno> listaporDNI(@PathVariable String dni){
		return service.listaPorDNI(dni);
	}
	
	@GetMapping("/listaPorFecha/{fechaInicio}/{fechaFin}")
	public List<Alumno> listaporFecha(@PathVariable LocalDate fechaInicio, @PathVariable LocalDate fechaFin){
		return service.listaPorFecha(fechaInicio, fechaFin);
	}

}
