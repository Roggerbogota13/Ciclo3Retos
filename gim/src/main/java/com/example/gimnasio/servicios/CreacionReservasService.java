package com.example.gimnasio.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gimnasio.entities.CreacionReservas;
import com.example.gimnasio.repositories.CreacionReservasRepository;



@Service
public class CreacionReservasService {

	@Autowired
	CreacionReservasRepository creacionReservasRepository;
	
	public List<CreacionReservas> getAll(){
		return (List<CreacionReservas>) creacionReservasRepository.getAll();
	}
	
	public Optional<CreacionReservas> getCreacionReservas(int id){
		return creacionReservasRepository.getCreacionReservas(id);
	}
	
	public CreacionReservas save(CreacionReservas creacionReservas) {
		
		if (creacionReservas.getId() == null) {
			return creacionReservasRepository.save(creacionReservas);
		}
		else {
			Optional<CreacionReservas> crema = creacionReservasRepository.getCreacionReservas(creacionReservas.getId());
			if(crema.isEmpty()) {
				return creacionReservasRepository.save(creacionReservas);
			}
			else {
				return creacionReservas;
			}
		}
	}
	
}
