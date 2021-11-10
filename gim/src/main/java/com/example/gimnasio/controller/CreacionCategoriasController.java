package com.example.gimnasio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gimnasio.entities.CreacionCategorias;
import com.example.gimnasio.servicios.CreacionCategoriasService;



@RestController
@RequestMapping("/api/Category")
public class CreacionCategoriasController {

private CreacionCategoriasService creacionCategoriasService;
	
	@GetMapping("/all")
	public List<CreacionCategorias> getCreacionCategorias(){
		return creacionCategoriasService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<CreacionCategorias> getCreacionCategoria(@PathVariable("id") int creacionCategoriaId){
		
		return creacionCategoriasService.getCreacionCategorias(creacionCategoriaId);
	}
	
	@PostMapping("/save")
	public CreacionCategorias save (@RequestBody CreacionCategorias creacionCategorias ) {
		return creacionCategoriasService.save(creacionCategorias);
	}
	
}
