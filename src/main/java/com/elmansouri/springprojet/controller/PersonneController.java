package com.elmansouri.springprojet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elmansouri.springprojet.dao.PersonneRepository;
import com.elmansouri.springprojet.entities.Personne;
import com.elmansouri.springprojet.service.PersonneService;

@RestController
public class PersonneController {
	
	@Autowired
	private PersonneService personneService;
	
	public PersonneController() {
	}
	
	
	@GetMapping(path = "/listPersonnes")
	public List<Personne> listePersonnes() {
		System.out.println("Liste personnne ");
		return personneService.listePersonnes();
	}
	
	@GetMapping(path = "/personnes")
	public List<Personne> getAll() {
		return this.personneService.getAll();
	}

}
