package com.primer.mentoria.test.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimerRest {
	
	@GetMapping("/saludo")
	public String getSaludo() {
		return "HOLA";
	}
	
	@PostMapping("/saludo")
	public String postSaludo(String saludo) {
		return saludo;
	}

}
