package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empresa.entity.Cliente;

public interface ClienteRepository 
				extends JpaRepository<Cliente, Integer>{

	@Query(nativeQuery = true, value = "select * from cliente")
	public abstract List<Cliente> listaClienteConSQLNativo();
	
}


