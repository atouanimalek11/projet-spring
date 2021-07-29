package tn.esprit.service;

import java.util.List;


import tn.esprit.entity.ClientPhysique;

public interface ClientPhysiqueService {
	List<ClientPhysique> retrieveAllClientsP();
	ClientPhysique addClientP(ClientPhysique c);
	void deleteClientPById(Integer id);
	ClientPhysique updateClientP(ClientPhysique c);
	ClientPhysique retrieveClientPById(Integer id);
}
