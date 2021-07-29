package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.DemandeCarteBancaireRepository;

@Service
public class DemandeCarteBancaireServiceImpl implements DemandeCarteBancaireService{

	@Autowired
	DemandeCarteBancaireRepository demandeCarteBancaireRep;

	public DemandeCarteBancaireRepository getDemandeCarteBancaireRep() {
		return demandeCarteBancaireRep;
	}

	public void setDemandeCarteBancaireRep(DemandeCarteBancaireRepository demandeCarteBancaireRep) {
		this.demandeCarteBancaireRep = demandeCarteBancaireRep;
	}

}
