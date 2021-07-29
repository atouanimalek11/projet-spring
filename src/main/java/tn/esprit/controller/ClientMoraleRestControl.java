package tn.esprit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entity.ClientMorale;
import tn.esprit.service.ClientMoraleService;

@RestController
@RequestMapping("/SpringMVC/servlet")
public class ClientMoraleRestControl {

	@Autowired
	ClientMoraleService clientMoraleServ;

	public ClientMoraleService getClientMoraleServ() {
		return clientMoraleServ;
	}

	public void setClientMoraleServ(ClientMoraleService clientMoraleServ) {
		this.clientMoraleServ = clientMoraleServ;
	}

	@GetMapping("/retrieve-all-client-morale")
	@ResponseBody
	public List<ClientMorale> getClientsMorale() {
		List<ClientMorale> list = clientMoraleServ.retrieveAllClientsM();
		return list;
	}

	@PostMapping("/add-client-morale")
	@ResponseBody
	public ClientMorale addClientM(@RequestBody ClientMorale c) {
		ClientMorale clientm = clientMoraleServ.addClientM(c);
		return clientm;
	}

	@DeleteMapping("/remove-client/{client-morale-id}")
	@ResponseBody
	public void removeClientMorale(@PathVariable("client-morale-id") Integer id) {
		clientMoraleServ.deleteClientMById(id);
	}

	@PutMapping("/modify-client")
	@ResponseBody
	public ClientMorale modifYClientMorale(@RequestBody ClientMorale c) {
		return clientMoraleServ.updateClientM(c);
	}

}
