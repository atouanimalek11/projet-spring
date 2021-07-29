package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Operation;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Integer>{

}
