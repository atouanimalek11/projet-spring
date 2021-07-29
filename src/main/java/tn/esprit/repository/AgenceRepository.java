package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Agence;

@Repository
public interface AgenceRepository extends JpaRepository<Agence, Integer>{

}
