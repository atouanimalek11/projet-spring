package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.ClientPhysique;

@Repository
public interface ClientPhysiqueRepository extends JpaRepository<ClientPhysique, Integer>{

}
