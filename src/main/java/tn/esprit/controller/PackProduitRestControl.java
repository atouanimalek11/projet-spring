package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.PackProduitService;

@RestController
public class PackProduitRestControl {

	@Autowired
	PackProduitService packProduitServ;

	public PackProduitService getPackProduitServ() {
		return packProduitServ;
	}

}
