package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.AvantageCompte;

@Repository
public interface AvantageCompteRepository extends JpaRepository<AvantageCompte, Integer>{

}
