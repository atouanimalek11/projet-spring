package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.DemandeCredit;

@Repository
public interface DemandeCreditRepository extends JpaRepository<DemandeCredit, Integer>{

}
