package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.DemandeCreditService;

@RestController
public class DemandeCreditRestControl {

	@Autowired
	DemandeCreditService demandeCreditServ;

	public DemandeCreditService getDemandeCreditServ() {
		return demandeCreditServ;
	}

	public void setDemandeCreditServ(DemandeCreditService demandeCreditServ) {
		this.demandeCreditServ = demandeCreditServ;
	}

}
