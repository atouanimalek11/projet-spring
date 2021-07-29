package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.DemandeUserSpaceService;

@RestController
public class DemandeUserSpaceRestControl {

	@Autowired
	DemandeUserSpaceService demandeUserSpaceServ;

	public DemandeUserSpaceService getDemandeUserSpaceServ() {
		return demandeUserSpaceServ;
	}

	public void setDemandeUserSpaceServ(DemandeUserSpaceService demandeUserSpaceServ) {
		this.demandeUserSpaceServ = demandeUserSpaceServ;
	}

}
