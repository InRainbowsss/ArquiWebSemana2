package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "autor")
public class Autor {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int idAutor;
	private String nombres;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String telefono;
	private LocalDateTime fechaRegistro;
	private LocalDateTime fechaActualizacion;
	private int estado;
	
	@ManyToOne
	@JoinColumn(name = "idPais")
	private Pais pais;
	
	@ManyToOne
	@JoinColumn(name = "idGrado")
	private DataCatalogo grado;

	
	
	
}





