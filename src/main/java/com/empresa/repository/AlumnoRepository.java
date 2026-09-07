package com.empresa.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empresa.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
	
	@Query(nativeQuery = true, value="select * from alumno where idalumno = ?1")
	public List<Alumno> listaAlumnoPorPK(int idAlumno);
	
	@Query(nativeQuery = true, value="select * from alumno where dni = ?1")
	public List<Alumno> listaAlumnoPorDni(String dni);
	
	@Query(nativeQuery = true, value="select * from alumno where fechanacimiento between ?1 and ?2")
	public List<Alumno> listaAlumnoPorFecha(LocalDate fechaInicio, LocalDate fechaFin);
}
