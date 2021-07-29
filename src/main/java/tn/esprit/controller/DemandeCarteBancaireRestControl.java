package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.DemandeCarteBancaireService;

@RestController
public class DemandeCarteBancaireRestControl {

	@Autowired
	DemandeCarteBancaireService demandeCarteBancaireServ;

	public DemandeCarteBancaireService getDemandeCarteBancaireServ() {
		return demandeCarteBancaireServ;
	}

	public void setDemandeCarteBancaireServ(DemandeCarteBancaireService demandeCarteBancaireServ) {
		this.demandeCarteBancaireServ = demandeCarteBancaireServ;
	}

}
