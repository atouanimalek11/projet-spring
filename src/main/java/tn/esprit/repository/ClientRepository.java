package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
