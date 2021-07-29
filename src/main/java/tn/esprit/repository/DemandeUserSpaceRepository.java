package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.DemandeUserSpace;

@Repository
public interface DemandeUserSpaceRepository extends JpaRepository<DemandeUserSpace, Integer>{

}
