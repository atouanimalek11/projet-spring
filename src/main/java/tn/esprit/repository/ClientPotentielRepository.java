package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.ClientPotentiel;

@Repository
public interface ClientPotentielRepository extends JpaRepository<ClientPotentiel, Integer>{

}
