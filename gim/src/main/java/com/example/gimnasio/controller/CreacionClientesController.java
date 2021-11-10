package com.example.gimnasio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gimnasio.entities.CreacionClientes;
import com.example.gimnasio.servicios.CreacionClientesService;



@RestController
@RequestMapping("/api/Client/")
public class CreacionClientesController {

private CreacionClientesService creacionClientesService;
	
	@GetMapping("/all")
	public List<CreacionClientes> getCreacionClientes(){
		return creacionClientesService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<CreacionClientes> getCreacionCliente(@PathVariable("id") int creacionClienteId){
		
		return creacionClientesService.getCreacionClientes(creacionClienteId);
	}
	
	@PostMapping("/save")
	public CreacionClientes save (@RequestBody CreacionClientes creacionClientes ) {
		return creacionClientesService.save(creacionClientes);
	}
	
}
