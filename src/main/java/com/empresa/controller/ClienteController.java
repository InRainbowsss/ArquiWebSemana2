package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Cliente;
import com.empresa.service.ClienteService;

@RestController
@RequestMapping("/url/cliente")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@GetMapping("/listaTodos")
	public List<Cliente> listaCliente(){
		return service.listaTodos();
	}
}


