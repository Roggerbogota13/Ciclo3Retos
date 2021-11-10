package com.example.gimnasio.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gimnasio.entities.CreacionCalificacionReservas;
import com.example.gimnasio.repositories.CreacionCalificacionReservasRepository;



@Service
public class CreacionCalificacionReservasService {

	@Autowired
	CreacionCalificacionReservasRepository creacionCalificacionReservasRepository;
	
	public List<CreacionCalificacionReservas> getAll(){
		return (List<CreacionCalificacionReservas>) creacionCalificacionReservasRepository.getAll();
	}
	
	public Optional<CreacionCalificacionReservas> getCreacionCalificacionReservas(int id){
		return creacionCalificacionReservasRepository.getCreacionCalificacionReservas(id);
	}
	
	public CreacionCalificacionReservas save(CreacionCalificacionReservas creacionCalificacionReservas) {
		
		if (creacionCalificacionReservas.getId() == null) {
			return creacionCalificacionReservasRepository.save(creacionCalificacionReservas);
		}
		else {
			Optional<CreacionCalificacionReservas> crema = creacionCalificacionReservasRepository.getCreacionCalificacionReservas(creacionCalificacionReservas.getId());
			if(crema.isEmpty()) {
				return creacionCalificacionReservasRepository.save(creacionCalificacionReservas);
			}
			else {
				return creacionCalificacionReservas;
			}
		}
	}
	
}
