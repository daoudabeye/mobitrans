package org.wallet.services;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wallet.models.Pays;
import org.wallet.repositories.PaysRepository;

@Service
public class PaysService {

	@Autowired
	PaysRepository paysRepository;
	
	@PostConstruct
	public void save(){
		this.save(new Pays("ML", "MALI", 0.0));
		this.save(new Pays("SN", "SENEGAL", 0.0));
	}
	
	public void save(Pays pays){
		paysRepository.save(pays);
	}
}
