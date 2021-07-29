package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.DemandeUserSpaceRepository;

@Service
public class DemandeUserSpaceServiceImpl implements DemandeUserSpaceService{
	
	@Autowired
	DemandeUserSpaceRepository demandeUserSpaceRep;

	public DemandeUserSpaceRepository getDemandeUserSpaceRep() {
		return demandeUserSpaceRep;
	}

	public void setDemandeUserSpaceRep(DemandeUserSpaceRepository demandeUserSpaceRep) {
		this.demandeUserSpaceRep = demandeUserSpaceRep;
	}
	
}
