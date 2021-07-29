package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Integer>{

}
