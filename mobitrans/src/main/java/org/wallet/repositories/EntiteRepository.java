package org.wallet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wallet.models.Entite;

@Repository
public interface EntiteRepository extends JpaRepository<Entite, Long> {

	List<Entite> findByNiveauAndPaysName(int niveau, String pays);
	
	List<Entite> findByDesignationAndPaysName(String designation, String pays);
	
	List<Entite> findByPaysName(String pays);
	
	List<Entite> findByZone(String zone);
	
	List<Entite> findByAdresse(String adresse);
	
	List<Entite> findByNom(String nom);
	
	List<Entite> findByEntiteNom(String nomEntiteSuperieur);
	
	List<Entite> findByEntiteId(Long idEntiteSuperieur);
	
}
