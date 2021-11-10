package com.example.gimnasio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gimnasio.entities.CreacionReservas;
import com.example.gimnasio.servicios.CreacionReservasService;



@RestController
@RequestMapping("/api/Reservation")
public class CreacionReservasController {

	
	private CreacionReservasService creacionReservasService;
	
	@GetMapping("/all")
	public List<CreacionReservas> getCreacionReservas(){
		return creacionReservasService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<CreacionReservas> getCreacionReserva(@PathVariable("id") int creacionReservasId){
		
		return creacionReservasService.getCreacionReservas(creacionReservasId);
	}
	
	@PostMapping("/save")
	public CreacionReservas save (@RequestBody CreacionReservas creacionReservas ) {
		return creacionReservasService.save(creacionReservas);
	}
}
