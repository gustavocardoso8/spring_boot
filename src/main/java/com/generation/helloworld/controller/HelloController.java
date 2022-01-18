package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello Família 41!";
	}
	
	@GetMapping ("/mentalidades")
	public String mentalidades () {
		return "A mentalidade que mais utilizei foi a de persistência. A habilidade foi de atenção aos detalhes";
	}
	
	@GetMapping ("/objetivos")
	public String objetivos () {
		return "Meu objetivo de aprendizagem é ajudar ainda mais meu grupo de PI nas tasks, além de dominar tudo que for possível sobre STS";
	}

}
