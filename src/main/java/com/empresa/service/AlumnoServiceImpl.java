package com.empresa.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Alumno;
import com.empresa.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	private AlumnoRepository repository;
	
	@Override
	public List<Alumno> listaPorPK(int idAlumno) {
		return repository.listaAlumnoPorPK(idAlumno);
	}
	public List<Alumno> listaPorDNI(String dni) {
		return repository.listaAlumnoPorDni(dni);
	}
	public List<Alumno> listaPorFecha(LocalDate fechaInicio, LocalDate fechaFin) {
		return repository.listaAlumnoPorFecha(fechaInicio, fechaFin);
	}

}
