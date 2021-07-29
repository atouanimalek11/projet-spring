package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.FactureRepository;

@Service
public class FactureServiceImpl implements FactureService{

	@Autowired
	FactureRepository factureRep;

	public FactureRepository getFactureRep() {
		return factureRep;
	}

	public void setFactureRep(FactureRepository factureRep) {
		this.factureRep = factureRep;
	}
	
}
