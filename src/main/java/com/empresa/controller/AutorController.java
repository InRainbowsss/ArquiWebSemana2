package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Autor;
import com.empresa.service.AutorService;

@RestController
@RequestMapping("/url/autor")
public class AutorController {
	
	@Autowired
	private AutorService service;
	
	@GetMapping("/listaPorPK/{id}")
	public List<Autor> listaPorPK(@PathVariable int id){
		return service.listaPorPK(id);
		
		
	}
}





