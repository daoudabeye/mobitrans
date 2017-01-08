package org.wallet.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.wallet.account.Account;
import org.wallet.account.AccountService;
import org.wallet.models.Entite;
import org.wallet.models.Pays;
import org.wallet.repositories.EntiteRepository;

@Service
public class EntiteService {

	@Autowired
	EntiteRepository entiteRepository;
	
	@Autowired
	AccountService accountService;
	
	public List<Entite> find(String pays, int niveau){
		return entiteRepository.findByNiveauAndPaysName(niveau, pays);
	}
	
	public List<Entite> find(String designation){
		Authentication auth =SecurityContextHolder.getContext().getAuthentication();
		String pays = "";
		String username = "";
		if(auth != null)
			username = auth.getName();
		
		Account acc = accountService.findByUsername(username);
		pays = acc != null ? acc.getPays() : "";
		
		Pays p = new Pays("ML", "MALI", 0.0);
		p.setId(1);
		Entite fake = new Entite("adresse", "boitePostal", 500000.0, "fax", "nom", "designation", "type", "telephone", "zone", 1, p);
		p.setEntites(new ArrayList<>());
		List<Entite> r = new ArrayList<>();
		r.add(fake);
		//return entiteRepository.findByDesignationAndPaysName(designation, pays);
		return r;
	}
	
	public List<Entite> find(int niveau){
		UserDetails userDetails =(UserDetails)SecurityContextHolder.
				getContext().getAuthentication().getPrincipal();
		String pays = "";
		String username = "";
		if(userDetails != null)
			username = userDetails.getUsername();
		
		Account acc = accountService.findByUsername(username);
		pays = acc != null ? acc.getPays() : "";
		
		return entiteRepository.findByNiveauAndPaysName(niveau, pays);
	}
}
