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


import tn.esprit.entity.ClientPhysique;
import tn.esprit.service.ClientPhysiqueService;

@RestController
@RequestMapping("/SpringMVC/servlet")
public class ClientPhysiqueRestControl {

	@Autowired
	ClientPhysiqueService clientPhysiqueServ;

	public ClientPhysiqueService getClientPhysiqueServ() {
		return clientPhysiqueServ;
	}

	public void setClientPhysiqueServ(ClientPhysiqueService clientPhysiqueServ) {
		this.clientPhysiqueServ = clientPhysiqueServ;
	}
	@GetMapping("/retrieve-all-client-physique")
	 @ResponseBody
	 public List<ClientPhysique> getClientsPhysique() {
	 List<ClientPhysique> list = clientPhysiqueServ.retrieveAllClientsP();
	 return list;
	}
	
	  @PostMapping("/add-client-physique")
	  @ResponseBody
	  public ClientPhysique addClientP(@RequestBody ClientPhysique c) {
		  ClientPhysique clientP = clientPhysiqueServ.addClientP(c);
	  return clientP;
	  }
	  
	
	   @DeleteMapping("/remove-client-physique/{client-physique-id}")
	   @ResponseBody
	   public void removeClientPhysique(@PathVariable("client-physique-id") Integer id) {
		   clientPhysiqueServ.deleteClientPById(id);
	   } 
	
	    @PutMapping("/modify-clientp")
	    @ResponseBody
	    public ClientPhysique modifYClientPhysique(@RequestBody ClientPhysique c) {
	    return clientPhysiqueServ.updateClientP(c);
	    }
	    
	   
}
