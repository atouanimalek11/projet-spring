package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.DemandeCreditRepository;

@Service
public class DemandeCreditServiceImpl implements DemandeCreditService {

	@Autowired
	DemandeCreditRepository demandeCreditRep;

	public DemandeCreditRepository getDemandeCreditRep() {
		return demandeCreditRep;
	}

	public void setDemandeCreditRep(DemandeCreditRepository demandeCreditRep) {
		this.demandeCreditRep = demandeCreditRep;
	}
	
}
