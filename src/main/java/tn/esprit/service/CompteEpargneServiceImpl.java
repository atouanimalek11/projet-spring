package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.CompteEpargneRepository;

@Service
public class CompteEpargneServiceImpl implements CompteEpargneService{
	
	@Autowired
	CompteEpargneRepository compteEpargneRep;

	public CompteEpargneRepository getCompteEpargneRep() {
		return compteEpargneRep;
	}

	public void setCompteEpargneRep(CompteEpargneRepository compteEpargneRep) {
		this.compteEpargneRep = compteEpargneRep;
	}

}
