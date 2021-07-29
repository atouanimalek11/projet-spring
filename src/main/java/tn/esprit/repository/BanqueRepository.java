package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Banque;

@Repository
public interface BanqueRepository extends JpaRepository<Banque, Integer>{

}
