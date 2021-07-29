package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.AgenceRepository;

@Service
public class AgenceServiceImpl implements AgenceService{

	@Autowired
	AgenceRepository agenceRep;

	public AgenceRepository getAgenceRep() {
		return agenceRep;
	}

	public void setAgenceRep(AgenceRepository agenceRep) {
		this.agenceRep = agenceRep;
	}
	
}
