package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Intervention;

@Repository
public interface InterventionRepository extends JpaRepository<Intervention, Integer>{

}
