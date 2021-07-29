package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.InterventionRepository;

@Service
public class InterventionServiceImpl implements InterventionService{

	@Autowired
	InterventionRepository interventionRepo;

	public InterventionRepository getInterventionRepo() {
		return interventionRepo;
	}

	public void setInterventionRepo(InterventionRepository interventionRepo) {
		this.interventionRepo = interventionRepo;
	}
	
}
