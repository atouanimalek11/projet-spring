package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.CompteCourantRepository;

@Service
public class CompteCourantServiceImpl implements CompteCourantService{
	
	@Autowired
	CompteCourantRepository compteCourantRep;

	public CompteCourantRepository getCompteCourantRep() {
		return compteCourantRep;
	}

	public void setCompteCourantRep(CompteCourantRepository compteCourantRep) {
		this.compteCourantRep = compteCourantRep;
	}

}
