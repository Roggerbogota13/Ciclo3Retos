package com.example.gimnasio.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.gimnasio.entities.CreacionCalificacionReservas;
import com.example.gimnasio.entities.CreacionCalificacionReservasCrud;



@Repository
public class CreacionCalificacionReservasRepository {

	@Autowired
	private CreacionCalificacionReservasCrud creacionCalificacionReservasCrudRepository;
	
	public List<CreacionCalificacionReservas> getAll(){
		
		return (List<CreacionCalificacionReservas>) creacionCalificacionReservasCrudRepository.findAll();
	
	}
	
	public Optional<CreacionCalificacionReservas> getCreacionCalificacionReservas(int id){
		
		return creacionCalificacionReservasCrudRepository.findById(id);
		
	}
	
	public CreacionCalificacionReservas save(CreacionCalificacionReservas creacionCalificacionReservas) {
		
		return creacionCalificacionReservasCrudRepository.save(creacionCalificacionReservas);
		
	}
	
}
