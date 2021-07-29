package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.CompteCourant;

@Repository
public interface CompteCourantRepository extends JpaRepository<CompteCourant, Integer>{

}
