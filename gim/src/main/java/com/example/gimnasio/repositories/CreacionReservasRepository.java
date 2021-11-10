package com.example.gimnasio.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.gimnasio.entities.CreacionReservas;
import com.example.gimnasio.entities.CreacionReservasCrud;



@Repository
public class CreacionReservasRepository {

	@Autowired
	private CreacionReservasCrud creacionReservasCrudRepository;
	
	public List<CreacionReservas> getAll(){
		
		return (List<CreacionReservas>) creacionReservasCrudRepository.findAll();
	
	}
	
	public Optional<CreacionReservas> getCreacionReservas(int id){
		
		return creacionReservasCrudRepository.findById(id);
		
	}
	
	public CreacionReservas save(CreacionReservas creacionReservas) {
		
		return creacionReservasCrudRepository.save(creacionReservas);
		
	}
	
	
}
