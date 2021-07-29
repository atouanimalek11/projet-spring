package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.PackProduitRepository;

@Service
public class PackProduitServiceImpl implements PackProduitService{

	@Autowired
	PackProduitRepository packProduitRep;

	public PackProduitRepository getPackProduitRep() {
		return packProduitRep;
	}

	public void setPackProduitRep(PackProduitRepository packProduitRep) {
		this.packProduitRep = packProduitRep;
	}
	
}
