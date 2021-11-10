package com.example.gimnasio.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.gimnasio.entities.CreacionMensajes;
import com.example.gimnasio.entities.CreacionMensajesCrud;



@Repository
public class CreacionMensajesRepository {

	@Autowired
	private CreacionMensajesCrud creacionMensajesCrudRepository;
	
	public List<CreacionMensajes> getAll(){
		
		return (List<CreacionMensajes>) creacionMensajesCrudRepository.findAll();
	
	}
	
	public Optional<CreacionMensajes> getCreacionMensajes(int id){
		
		return creacionMensajesCrudRepository.findById(id);
		
	}
	
	public CreacionMensajes save(CreacionMensajes creacionMensajes) {
		
		return creacionMensajesCrudRepository.save(creacionMensajes);
		
	}
	
}
