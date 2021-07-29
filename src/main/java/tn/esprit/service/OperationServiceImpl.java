package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.OperationRepository;

@Service
public class OperationServiceImpl implements OperationService{

	@Autowired
	OperationRepository operationRep;

	public OperationRepository getOperationRep() {
		return operationRep;
	}

	public void setOperationRep(OperationRepository operationRep) {
		this.operationRep = operationRep;
	}
	
}
