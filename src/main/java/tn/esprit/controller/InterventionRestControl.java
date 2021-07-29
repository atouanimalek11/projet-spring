package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.InterventionService;

@RestController
public class InterventionRestControl {

	@Autowired
	InterventionService interventionServ;

	public InterventionService getInterventionServ() {
		return interventionServ;
	}

	public void setInterventionServ(InterventionService interventionServ) {
		this.interventionServ = interventionServ;
	}

}
