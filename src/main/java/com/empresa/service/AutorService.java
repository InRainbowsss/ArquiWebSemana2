package com.empresa.service;

import java.util.List;

import com.empresa.entity.Autor;

public interface AutorService {

	public abstract List<Autor> listaPorPK(int idAutor);
}
