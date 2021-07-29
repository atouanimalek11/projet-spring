package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.CompteEpargne;

@Repository
public interface CompteEpargneRepository extends JpaRepository<CompteEpargne, Integer>{

}
