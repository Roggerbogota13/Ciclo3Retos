package com.example.gimnasio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gimnasio.entities.CreacionUsuarioAdministradores;
import com.example.gimnasio.servicios.CreacionUsuarioAdministradoresService;



@RestController
@RequestMapping("/api/Admin")
public class CreacionUsuarioAdministradoresController {

private CreacionUsuarioAdministradoresService creacionUsuarioAdministradoresService;
	
	@GetMapping("/all")
	public List<CreacionUsuarioAdministradores> getCreacionUsuarioAdministradores(){
		return creacionUsuarioAdministradoresService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<CreacionUsuarioAdministradores> getCreacionUsuarioAdministradore(@PathVariable("id") int creacionUsuarioAdministradoresId){
		
		return creacionUsuarioAdministradoresService.getCreacionUsuarioAdministradores(creacionUsuarioAdministradoresId);
	}
	
	@PostMapping("/save")
	public CreacionUsuarioAdministradores save (@RequestBody CreacionUsuarioAdministradores creacionUsuarioAdministradores ) {
		return creacionUsuarioAdministradoresService.save(creacionUsuarioAdministradores);
	}
	
}
