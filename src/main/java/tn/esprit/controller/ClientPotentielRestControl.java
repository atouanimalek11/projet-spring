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

import tn.esprit.entity.ClientPotentiel;
import tn.esprit.service.ClientPotentielService;

@RestController
@RequestMapping("/SpringMVC/servlet")
public class ClientPotentielRestControl {

	@Autowired
	ClientPotentielService clientPotentielServ;

	public ClientPotentielService getClientPotentielServ() {
		return clientPotentielServ;
	}

	public void setClientPotentielServ(ClientPotentielService clientPotentielServ) {
		this.clientPotentielServ = clientPotentielServ;
	}

	@GetMapping("/retrieve-all-client-potentiel")
	@ResponseBody
	public List<ClientPotentiel> getClientsPotentiel() {
		List<ClientPotentiel> list = clientPotentielServ.retrieveAllClientsPt();
		return list;
	}

	@PostMapping("/add-client-potentiel")
	@ResponseBody
	public ClientPotentiel addClientPt(@RequestBody ClientPotentiel c) {
		ClientPotentiel clientPt = clientPotentielServ.addClientPt(c);
		return clientPt;
	}

	@DeleteMapping("/remove-client-potentiel/{client-potentiel-id}")
	@ResponseBody
	public void removeClientPotentiel(@PathVariable("client-potentiel-id") Integer id) {
		clientPotentielServ.deleteClientPtById(id);
	}

	@PutMapping("/modify-clientpt")
	@ResponseBody
	public ClientPotentiel modifYClientPotentiel(@RequestBody ClientPotentiel c) {
		return clientPotentielServ.updateClientPt(c);
	}

	@PostMapping("/confirmer-demande-client-potentiel/{idDemande}")
	@ResponseBody
	public boolean confirmerDemandeClientPotentiel(@PathVariable("idDemande") int idDemande) {
		return clientPotentielServ.confirmerDemande(idDemande);

	}
}
