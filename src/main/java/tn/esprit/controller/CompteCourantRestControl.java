package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.CompteCourantService;

@RestController
public class CompteCourantRestControl {

	@Autowired
	CompteCourantService compteCourantServ;

	public CompteCourantService getCompteCourantServ() {
		return compteCourantServ;
	}

	public void setCompteCourantServ(CompteCourantService compteCourantServ) {
		this.compteCourantServ = compteCourantServ;
	}

}
