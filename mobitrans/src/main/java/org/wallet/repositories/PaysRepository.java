package org.wallet.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wallet.models.Pays;

@Repository
public interface PaysRepository extends CrudRepository<Pays, Integer>  {

}
