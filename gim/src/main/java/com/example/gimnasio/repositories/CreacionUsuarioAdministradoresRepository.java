package com.example.gimnasio.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.gimnasio.entities.CreacionUsuarioAdministradores;
import com.example.gimnasio.entities.CreacionUsuarioAdministradoresCrud;



@Repository
public class CreacionUsuarioAdministradoresRepository {

	@Autowired
	private CreacionUsuarioAdministradoresCrud creacionUsuarioAdministradoresCrudRepository;
	
	public List<CreacionUsuarioAdministradores> getAll(){
		
		return (List<CreacionUsuarioAdministradores>) creacionUsuarioAdministradoresCrudRepository.findAll();
	
	}
	
	public Optional<CreacionUsuarioAdministradores> getCreacionUsuarioAdministradores(int id){
		
		return creacionUsuarioAdministradoresCrudRepository.findById(id);
		
	}
	
	public CreacionUsuarioAdministradores save(CreacionUsuarioAdministradores creacionUsuarioAdministradores) {
		
		return creacionUsuarioAdministradoresCrudRepository.save(creacionUsuarioAdministradores);
		
	}
	
}
