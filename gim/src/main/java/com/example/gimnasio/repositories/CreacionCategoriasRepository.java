package com.example.gimnasio.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.gimnasio.entities.CreacionCategorias;
import com.example.gimnasio.entities.CreacionCategoriasCrud;


@Repository
public class CreacionCategoriasRepository {
	
	@Autowired
	private CreacionCategoriasCrud creacionCategoriasCrudRepository;
	
	public List<CreacionCategorias> getAll(){
		
		return (List<CreacionCategorias>) creacionCategoriasCrudRepository.findAll();
	
	}
	
	public Optional<CreacionCategorias> getCreacionCategorias(int id){
		
		return creacionCategoriasCrudRepository.findById(id);
		
	}
	
	public CreacionCategorias save(CreacionCategorias creacionCategorias) {
		
		return creacionCategoriasCrudRepository.save(creacionCategorias);
		
	}

}
