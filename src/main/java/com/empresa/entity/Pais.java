package com.empresa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pais")
public class Pais {

	@Id
	private int idPais;
	private String iso;
	//@Column(name = "nombre")
	private String nombre;
}
