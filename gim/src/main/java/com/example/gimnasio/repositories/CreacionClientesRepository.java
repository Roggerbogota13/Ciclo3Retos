package com.example.gimnasio.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.gimnasio.entities.CreacionClientes;
import com.example.gimnasio.entities.CreacionClientesCrud;



@Repository
public class CreacionClientesRepository {
	
	@Autowired
	private CreacionClientesCrud creacionClientesCrudRepository;
	
	public List<CreacionClientes> getAll(){
		
		return (List<CreacionClientes>) creacionClientesCrudRepository.findAll();
	
	}
	
	public Optional<CreacionClientes> getCreacionClientes(int id){
		
		return creacionClientesCrudRepository.findById(id);
		
	}
	
	public CreacionClientes save(CreacionClientes creacionClientes) {
		
		return creacionClientesCrudRepository.save(creacionClientes);
		
	}

}
