package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Facture;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Integer>{

}
