package com.example.gimnasio.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gimnasio.entities.CreacionCategorias;
import com.example.gimnasio.repositories.CreacionCategoriasRepository;



@Service
public class CreacionCategoriasService {

	@Autowired
	CreacionCategoriasRepository creacionCategoriasRepository;
	
	public List<CreacionCategorias> getAll(){
		return (List<CreacionCategorias>) creacionCategoriasRepository.getAll();
	}
	
	public Optional<CreacionCategorias> getCreacionCategorias(int id){
		return creacionCategoriasRepository.getCreacionCategorias(id);
	}
	
	public CreacionCategorias save(CreacionCategorias creacionCategorias) {
		
		if (creacionCategorias.getId() == null) {
			return creacionCategoriasRepository.save(creacionCategorias);
		}
		else {
			Optional<CreacionCategorias> crema = creacionCategoriasRepository.getCreacionCategorias(creacionCategorias.getId());
			if(crema.isEmpty()) {
				return creacionCategoriasRepository.save(creacionCategorias);
			}
			else {
				return creacionCategorias;
			}
		}
	}
	
}
