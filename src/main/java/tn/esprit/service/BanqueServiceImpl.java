package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.BanqueRepository;

@Service
public class BanqueServiceImpl implements BanqueService {
	
	@Autowired
	BanqueRepository banqueRep;

	public BanqueRepository getBanqueRep() {
		return banqueRep;
	}

	public void setBanqueRep(BanqueRepository banqueRep) {
		this.banqueRep = banqueRep;
	}
	
}
