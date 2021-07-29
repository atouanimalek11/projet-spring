package tn.esprit.service;

import java.util.List;


import tn.esprit.entity.ClientPotentiel;

public interface ClientPotentielService {
	List<ClientPotentiel> retrieveAllClientsPt();
	ClientPotentiel addClientPt(ClientPotentiel c);
	void deleteClientPtById(Integer id);
	ClientPotentiel updateClientPt(ClientPotentiel c);
	ClientPotentiel retrieveClientPtById(Integer id);
	
	public boolean confirmerDemande(int id);
}
