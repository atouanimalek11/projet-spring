package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.AvantageCompteService;

@RestController
public class AvantageCompteRestControl {

	@Autowired
	AvantageCompteService avantageCompteServ;

	public AvantageCompteService getAvantageCompteServ() {
		return avantageCompteServ;
	}

	public void setAvantageCompteServ(AvantageCompteService avantageCompteServ) {
		this.avantageCompteServ = avantageCompteServ;
	}

}
