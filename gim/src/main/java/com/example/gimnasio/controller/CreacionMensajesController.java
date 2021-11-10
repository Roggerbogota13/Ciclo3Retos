package com.example.gimnasio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gimnasio.entities.CreacionMensajes;
import com.example.gimnasio.servicios.CreacionMensajesService;


@RestController
@RequestMapping("/api/Message")
public class CreacionMensajesController {

	private CreacionMensajesService creacionMensajesService;
	
	@GetMapping("/all")
	public List<CreacionMensajes> getCreacionMensajes(){
		return creacionMensajesService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<CreacionMensajes> getCreacionMensaje(@PathVariable("id") int creacionMensajeId){
		
		return creacionMensajesService.getCreacionMensajes(creacionMensajeId);
	}
	
	@PostMapping("/save")
	public CreacionMensajes save (@RequestBody CreacionMensajes creacionMensajes ) {
		return creacionMensajesService.save(creacionMensajes);
	}
	
}
