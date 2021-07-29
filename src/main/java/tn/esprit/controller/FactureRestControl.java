package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.FactureService;

@RestController
public class FactureRestControl {

	@Autowired
	FactureService factureServ;

	public FactureService getFactureServ() {
		return factureServ;
	}

	public void setFactureServ(FactureService factureServ) {
		this.factureServ = factureServ;
	}

}
