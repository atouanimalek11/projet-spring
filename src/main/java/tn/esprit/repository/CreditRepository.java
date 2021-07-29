package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Credit;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Integer>{

}
