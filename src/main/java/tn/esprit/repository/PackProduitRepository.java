package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.PackProduit;

@Repository
public interface PackProduitRepository extends JpaRepository<PackProduit, Integer>{

}
