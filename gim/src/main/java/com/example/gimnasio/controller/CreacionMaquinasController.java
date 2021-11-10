package com.example.gimnasio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gimnasio.entities.CreacionMaquinas;
import com.example.gimnasio.servicios.CreacionMaquinasService;

@RestController
@RequestMapping("/api/Gymmachine")
public class CreacionMaquinasController {
	
	private CreacionMaquinasService creacionMaquinasService;
	
	@GetMapping("/all")
	public List<CreacionMaquinas> getCreacionMaquinas(){
		return creacionMaquinasService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<CreacionMaquinas> getCreacionMaquina(@PathVariable("id") int creacionMaquinaId){
		
		return creacionMaquinasService.getCreacionMaquinas(creacionMaquinaId);
	}
	
	@PostMapping("/save")
	public CreacionMaquinas save (@RequestBody CreacionMaquinas creacionMaquinas ) {
		return creacionMaquinasService.save(creacionMaquinas);
	}

}
