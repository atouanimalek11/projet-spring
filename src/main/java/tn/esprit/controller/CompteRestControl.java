package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.CompteService;

@RestController
public class CompteRestControl {

	@Autowired 
	CompteService compteServ;

	public CompteService getCompteServ() {
		return compteServ;
	}

	public void setCompteServ(CompteService compteServ) {
		this.compteServ = compteServ;
	}

}
