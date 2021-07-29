package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entity.ClientMorale;
import tn.esprit.repository.ClientMoraleRepository;

@Service
public class ClientMoraleServiceImpl implements ClientMoraleService{

	@Autowired
	ClientMoraleRepository clientMoraleRep;

	public ClientMoraleRepository getClientMoraleRep() {
		return clientMoraleRep;
	}

	public void setClientMoraleRep(ClientMoraleRepository clientMoraleRep) {
		this.clientMoraleRep = clientMoraleRep;
	}

	@Override
	public List<ClientMorale> retrieveAllClientsM() {
		
		return clientMoraleRep.findAll();
	}

	@Override
	public ClientMorale addClientM(ClientMorale c) {
		
		return clientMoraleRep.save(c);
		
	}

	@Override
	public void deleteClientMById(Integer id) {
		clientMoraleRep.deleteById(id);
		
	}

	@Override
	public ClientMorale updateClientM(ClientMorale c) {
		
		return clientMoraleRep.save(c);
	}

	@Override
	public ClientMorale retrieveClientMById(Integer id) {
		
		return clientMoraleRep.findById(id).get();
	}
	
}
