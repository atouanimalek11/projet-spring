package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.AgenceService;

@RestController
public class AgenceRestControl {

	@Autowired
	AgenceService agenceServ;

	public AgenceService getAgenceServ() {
		return agenceServ;
	}

	public void setAgenceServ(AgenceService agenceServ) {
		this.agenceServ = agenceServ;
	}

}
