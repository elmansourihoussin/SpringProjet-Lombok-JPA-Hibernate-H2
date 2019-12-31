package com.elmansouri.springprojet.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.elmansouri.springprojet.dao.PersonneRepository;
import com.elmansouri.springprojet.entities.Personne;
import com.elmansouri.springprojet.service.PersonneService;

@Service
@Transactional
public class PersonnneServiceImpl implements PersonneService {
	
	@Autowired
	private PersonneRepository personneDao;
	
	Logger LOGGER = LoggerFactory.getLogger(PersonnneServiceImpl.class);

	@Override
	public Personne add(Personne personne) {
		try {
			if (personne != null) {
				LOGGER.info("-- Ajouter personne : {0}", personne.toString());
				return personneDao.save(personne);
			} else 
				return null;
		} catch(Exception ex) {
			LOGGER.error("Error : " + ex.getMessage());
			return null;
		}
	}

	@Override
	public Personne edit(Personne personne) {
		try {
			if (personne != null) 
				return personneDao.save(personne);
			 else 
				return null;
		} catch(Exception ex) {
			LOGGER.error("Error : " + ex.getMessage());
			return null;
		}
	}

	@Override
	public void delete(Long id) {
		if(id != null)
			personneDao.deleteById(id);
	}

	@Override
	public void delete(Personne personne) {
		if(personne != null)
			personneDao.delete(personne);
	}

	@Override
	public List<Personne> getAll() {
		try {
			LOGGER.info("Get liste personne ");
			List<Personne> personnes = personneDao.findAll();
			if(!personnes.isEmpty())
			   return personnes;
			else 
				return Collections.emptyList();
		} catch (Exception e) {
			LOGGER.error("Erreur {} ", e);
			 return Collections.emptyList();
		}
	}
	

	@Override
	public List<Personne> listePersonnes() {
		try {
			List<Personne> personnes = personneDao.listePersonnes();
			if(!personnes.isEmpty())
			   return personnes;
			else 
				return Collections.emptyList();
		} catch (Exception e) {
			LOGGER.error("Erreur {} ", e);
			 return Collections.emptyList();
		}
	}


	@Override
	public Optional<Personne> getById(Long id) {
		return personneDao.findById(id);
	}

	@Override
	public Optional<Personne> getByNom(String nom) {
		return personneDao.findByNom(nom);
	}

}
