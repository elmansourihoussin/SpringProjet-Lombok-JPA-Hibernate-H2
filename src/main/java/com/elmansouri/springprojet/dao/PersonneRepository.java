package com.elmansouri.springprojet.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.elmansouri.springprojet.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
	
	@Query("SELECT p from Personne p ")
	List<Personne> listePersonnes();
	
	Optional<Personne> findByNom(String nom);

}
