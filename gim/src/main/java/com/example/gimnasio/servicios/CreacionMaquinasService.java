package com.example.gimnasio.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gimnasio.entities.CreacionMaquinas;
import com.example.gimnasio.repositories.CreacionMaquinasRepository;

@Service
public class CreacionMaquinasService {
	
	@Autowired
	CreacionMaquinasRepository creacionMaquinasRepository;
	
	public List<CreacionMaquinas> getAll(){
		return (List<CreacionMaquinas>) creacionMaquinasRepository.getAll();
	}
	
	public Optional<CreacionMaquinas> getCreacionMaquinas(int id){
		return creacionMaquinasRepository.getCreacionMaquinas(id);
	}
	
	public CreacionMaquinas save(CreacionMaquinas creacionMaquinas) {
		
		if (creacionMaquinas.getId() == null) {
			return creacionMaquinasRepository.save(creacionMaquinas);
		}
		else {
			Optional<CreacionMaquinas> crema = creacionMaquinasRepository.getCreacionMaquinas(creacionMaquinas.getId());
			if(crema.isEmpty()) {
				return creacionMaquinasRepository.save(creacionMaquinas);
			}
			else {
				return creacionMaquinas;
			}
		}
	}

}
