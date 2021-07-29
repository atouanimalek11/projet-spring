package tn.esprit.service;

import java.util.List;


import tn.esprit.entity.ClientMorale;

public interface ClientMoraleService {
	List<ClientMorale> retrieveAllClientsM();
	ClientMorale addClientM(ClientMorale c);
	void deleteClientMById(Integer id);
	ClientMorale updateClientM(ClientMorale c);
	ClientMorale retrieveClientMById(Integer id);
}
