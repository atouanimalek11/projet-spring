package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.CompteRepository;

@Service
public class CompteServiceImpl implements CompteService{

	@Autowired
	CompteRepository compteRep;

	public CompteRepository getCompteRep() {
		return compteRep;
	}

	public void setCompteRep(CompteRepository compteRep) {
		this.compteRep = compteRep;
	}

}
