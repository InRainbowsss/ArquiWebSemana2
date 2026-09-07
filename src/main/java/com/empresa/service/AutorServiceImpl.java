package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Autor;
import com.empresa.repository.AutorRepository;

@Service
public class AutorServiceImpl implements AutorService {

	@Autowired
	private AutorRepository repository;
	
	@Override
	public List<Autor> listaPorPK(int idAutor) {
		return repository.listaAutorPorPK(idAutor);
	}

}
