package com.example.gimnasio.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.gimnasio.entities.CreacionMaquinas;
import com.example.gimnasio.entities.CreacionMaquinasCrud;

@Repository
public class CreacionMaquinasRepository {
	
	@Autowired
	private CreacionMaquinasCrud creacionMaquinasCrudRepository;
	
	public List<CreacionMaquinas> getAll(){
		
		return (List<CreacionMaquinas>) creacionMaquinasCrudRepository.findAll();
	
	}
	
	public Optional<CreacionMaquinas> getCreacionMaquinas(int id){
		
		return creacionMaquinasCrudRepository.findById(id);
		
	}
	
	public CreacionMaquinas save(CreacionMaquinas creacionMaquinas) {
		
		return creacionMaquinasCrudRepository.save(creacionMaquinas);
		
	}
	
	

}
