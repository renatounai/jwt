package br.cnec.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioRestController {
	
	@GetMapping("/privado")
	public String metodoQueApenasPodeSerAcessadoComToken() {
		return "você tinha um token!";
	}
}
