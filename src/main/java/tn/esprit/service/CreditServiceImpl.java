package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.CreditRepository;

@Service
public class CreditServiceImpl implements CreditService{
	
	@Autowired 
	CreditRepository creditRep;

	public CreditRepository getCreditRep() {
		return creditRep;
	}

	public void setCreditRep(CreditRepository creditRep) {
		this.creditRep = creditRep;
	}
	
}
