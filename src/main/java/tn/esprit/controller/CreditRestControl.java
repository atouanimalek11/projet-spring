package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.CreditService;

@RestController
public class CreditRestControl {

	@Autowired
	CreditService creditServ;

	public CreditService getCreditServ() {
		return creditServ;
	}

	public void setCreditServ(CreditService creditServ) {
		this.creditServ = creditServ;
	}

}
