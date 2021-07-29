package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.CreditArchiveService;

@RestController
public class CreditArchiveRestControl {

	@Autowired
	CreditArchiveService creditArchiveServ;

	public CreditArchiveService getCreditArchiveServ() {
		return creditArchiveServ;
	}

	public void setCreditArchiveServ(CreditArchiveService creditArchiveServ) {
		this.creditArchiveServ = creditArchiveServ;
	}
	
}
