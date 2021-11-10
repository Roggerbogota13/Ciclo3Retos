package com.example.gimnasio.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gimnasio.entities.CreacionClientes;
import com.example.gimnasio.repositories.CreacionClientesRepository;



@Service
public class CreacionClientesService {
	
	@Autowired
	CreacionClientesRepository creacionClientesRepository;
	
	public List<CreacionClientes> getAll(){
		return (List<CreacionClientes>) creacionClientesRepository.getAll();
	}
	
	public Optional<CreacionClientes> getCreacionClientes(int id){
		return creacionClientesRepository.getCreacionClientes(id);
	}
	
	public CreacionClientes save(CreacionClientes creacionClientes) {
		
		if (creacionClientes.getId() == null) {
			return creacionClientesRepository.save(creacionClientes);
		}
		else {
			Optional<CreacionClientes> crema = creacionClientesRepository.getCreacionClientes(creacionClientes.getId());
			if(crema.isEmpty()) {
				return creacionClientesRepository.save(creacionClientes);
			}
			else {
				return creacionClientes;
			}
		}
	}

}
