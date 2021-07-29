package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.CompteEpargneService;

@RestController
public class CompteEpargneRestControl {
	
	@Autowired
	CompteEpargneService compteEpargneServ;

	public CompteEpargneService getCompteEpargneServ() {
		return compteEpargneServ;
	}

	public void setCompteEpargneServ(CompteEpargneService compteEpargneServ) {
		this.compteEpargneServ = compteEpargneServ;
	}

}
