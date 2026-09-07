package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empresa.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer>{
	
	//Usando Query Nativo de PostgreSQL
	@Query(nativeQuery = true, value="select * from autor where idautor = ?1")
	public List<Autor> listaAutorPorPK(int idAutor);
	
	
}
