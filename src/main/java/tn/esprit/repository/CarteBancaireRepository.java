package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.CarteBancaire;

@Repository
public interface CarteBancaireRepository extends JpaRepository<CarteBancaire, Integer>{

}
