package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.DemandeCarteBancaire;

@Repository
public interface DemandeCarteBancaireRepository extends JpaRepository<DemandeCarteBancaire, Integer>{

}
