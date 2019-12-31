package com.elmansouri.springprojet.service;

import java.util.List;
import java.util.Optional;

import com.elmansouri.springprojet.entities.Personne;

/**
 * 
 * @author EELMANSOURI
 *
 */
public interface PersonneService {
	
	Personne add(Personne personne);
	Personne edit(Personne personne);
	void delete(Long id);
	void delete(Personne personne);
	List<Personne> getAll();
	List<Personne> listePersonnes();
	Optional<Personne> getById(Long id);
	Optional<Personne> getByNom(String nom);

}
