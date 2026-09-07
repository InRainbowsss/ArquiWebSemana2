package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Cliente;
import com.empresa.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	public ClienteRepository repository;
	
	@Override
	public List<Cliente> listaTodos() {
		return repository.listaClienteConSQLNativo();
	}

	
}





