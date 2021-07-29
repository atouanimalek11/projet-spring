package tn.esprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.CreditArchive;

@Repository
public interface CreditArchiveRepository extends JpaRepository<CreditArchive, Integer>{

}
