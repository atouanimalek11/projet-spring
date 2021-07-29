package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.ClientMorale;

@Repository
public interface ClientMoraleRepository extends JpaRepository<ClientMorale, Integer> {

}
