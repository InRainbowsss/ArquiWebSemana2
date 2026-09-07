package com.empresa.entity;

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
@Table(name = "data_catalogo")
public class DataCatalogo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDataCatalogo;
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "idCatalogo")
	private Catalogo catalogo;

}
