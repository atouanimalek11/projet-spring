package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.BanqueService;

@RestController
public class BanqueRestControl {

	@Autowired
	BanqueService banqueServ;

	public BanqueService getBanqueServ() {
		return banqueServ;
	}

	public void setBanqueServ(BanqueService banqueServ) {
		this.banqueServ = banqueServ;
	}

}
