package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.AvantageCompteRepository;

@Service
public class AvantageCompteServiceImpl implements AvantageCompteService{
@Autowired
	AvantageCompteRepository avantageCompteRep;

	public AvantageCompteRepository getAvantageCompteRep() {
		return avantageCompteRep;
	}

	public void setAvantageCompteRep(AvantageCompteRepository avantageCompteRep) {
		this.avantageCompteRep = avantageCompteRep;
	}
	
}
