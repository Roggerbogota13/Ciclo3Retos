package com.example.gimnasio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gimnasio.entities.CreacionCalificacionReservas;
import com.example.gimnasio.servicios.CreacionCalificacionReservasService;



@RestController
@RequestMapping("/api/Score")
public class CreacionCalificacionReservasController {
	
private CreacionCalificacionReservasService creacionCalificacionReservasService;
	
	@GetMapping("/all")
	public List<CreacionCalificacionReservas> getCreacionCalificacionReservas(){
		return creacionCalificacionReservasService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<CreacionCalificacionReservas> getCreacionCalificacionReserva(@PathVariable("id") int creacionCalificacionReservaId){
		
		return creacionCalificacionReservasService.getCreacionCalificacionReservas(creacionCalificacionReservaId);
	}
	
	@PostMapping("/save")
	public CreacionCalificacionReservas save (@RequestBody CreacionCalificacionReservas creacionCalificacionReservas ) {
		return creacionCalificacionReservasService.save(creacionCalificacionReservas);
	}

}
