package tn.esprit.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	ClientRepository clientRepo;

	

	public ClientRepository getClientRepo() {
		return clientRepo;
	}

	public void setClientRepo(ClientRepository clientRepo) {
		this.clientRepo = clientRepo;
	}


	
}
