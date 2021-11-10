package com.example.gimnasio.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gimnasio.entities.CreacionUsuarioAdministradores;
import com.example.gimnasio.repositories.CreacionUsuarioAdministradoresRepository;



@Service
public class CreacionUsuarioAdministradoresService {
	
	@Autowired
	CreacionUsuarioAdministradoresRepository creacionUsuarioAdministradoresRepository;
	
	public List<CreacionUsuarioAdministradores> getAll(){
		return (List<CreacionUsuarioAdministradores>) creacionUsuarioAdministradoresRepository.getAll();
	}
	
	public Optional<CreacionUsuarioAdministradores> getCreacionUsuarioAdministradores(int id){
		return creacionUsuarioAdministradoresRepository.getCreacionUsuarioAdministradores(id);
	}
	
	public CreacionUsuarioAdministradores save(CreacionUsuarioAdministradores creacionUsuarioAdministradores) {
		
		if (creacionUsuarioAdministradores.getId() == null) {
			return creacionUsuarioAdministradoresRepository.save(creacionUsuarioAdministradores);
		}
		else {
			Optional<CreacionUsuarioAdministradores> crema = creacionUsuarioAdministradoresRepository.getCreacionUsuarioAdministradores(creacionUsuarioAdministradores.getId());
			if(crema.isEmpty()) {
				return creacionUsuarioAdministradoresRepository.save(creacionUsuarioAdministradores);
			}
			else {
				return creacionUsuarioAdministradores;
			}
		}
	}


}
