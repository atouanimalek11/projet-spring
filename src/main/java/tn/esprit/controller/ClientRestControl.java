package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.ClientService;

@RestController
public class ClientRestControl {

	@Autowired
	ClientService clientServ;

	public ClientService getClientServ() {
		return clientServ;
	}

	public void setClientServ(ClientService clientServ) {
		this.clientServ = clientServ;
	}
	
	
	
	
	
	
	
	
}
