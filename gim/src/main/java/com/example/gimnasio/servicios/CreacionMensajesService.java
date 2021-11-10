package com.example.gimnasio.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gimnasio.entities.CreacionMensajes;
import com.example.gimnasio.repositories.CreacionMensajesRepository;



@Service
public class CreacionMensajesService {

	@Autowired
	CreacionMensajesRepository creacionMensajesRepository;
	
	public List<CreacionMensajes> getAll(){
		return (List<CreacionMensajes>) creacionMensajesRepository.getAll();
	}
	
	public Optional<CreacionMensajes> getCreacionMensajes(int id){
		return creacionMensajesRepository.getCreacionMensajes(id);
	}
	
	public CreacionMensajes save(CreacionMensajes creacionMensajes) {
		
		if (creacionMensajes.getId() == null) {
			return creacionMensajesRepository.save(creacionMensajes);
		}
		else {
			Optional<CreacionMensajes> crema = creacionMensajesRepository.getCreacionMensajes(creacionMensajes.getId());
			if(crema.isEmpty()) {
				return creacionMensajesRepository.save(creacionMensajes);
			}
			else {
				return creacionMensajes;
			}
		}
	}
	
}
