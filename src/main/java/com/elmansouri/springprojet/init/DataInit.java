package com.elmansouri.springprojet.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.elmansouri.springprojet.dao.PersonneRepository;
import com.elmansouri.springprojet.entities.Personne;

@Component
public class DataInit implements ApplicationRunner {
	
	
	private PersonneRepository personneDao;
	
	@Autowired
	public DataInit(PersonneRepository personneDao) {
		this.personneDao = personneDao;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		long count = personneDao.count();
		if(count == 0) {
			Personne p1 = new Personne(1L, "Thomas", "Louis");
		Personne p2 = new Personne(2L, "Alexendre", "Richard");
		Personne p3 = new Personne(3L, "Antonin", "Moreau");
		Personne p4 = new Personne(4L, "Audan", "Miriam");
		
			personneDao.save(p1);
		    personneDao.save(p2);
		    personneDao.save(p3);
		    personneDao.save(p4);
		}
	}
	
	

}
