package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entity.ClientPhysique;
import tn.esprit.repository.ClientPhysiqueRepository;

@Service
public class ClientPhysiqueServiceImpl implements ClientPhysiqueService {
	@Autowired
	ClientPhysiqueRepository clientPhysiqueRep;

	public ClientPhysiqueRepository getClientPhysiqueRep() {
		return clientPhysiqueRep;
	}

	public void setClientPhysiqueRep(ClientPhysiqueRepository clientPhysiqueRep) {
		this.clientPhysiqueRep = clientPhysiqueRep;
	}

	@Override
	public List<ClientPhysique> retrieveAllClientsP() {
		return clientPhysiqueRep.findAll();
	}

	@Override
	public ClientPhysique addClientP(ClientPhysique c) {
		
		return clientPhysiqueRep.save(c);
	}

	@Override
	public void deleteClientPById(Integer id) {
		clientPhysiqueRep.deleteById(id);
		
	}

	@Override
	public ClientPhysique updateClientP(ClientPhysique c) {
		
		return clientPhysiqueRep.save(c);
		
	}

	@Override
	public ClientPhysique retrieveClientPById(Integer id) {
		
		return clientPhysiqueRep.findById(id).get();
	}
	
}
