package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.CreditArchiveRepository;

@Service
public class CreditArchiveServiceImpl implements CreditArchiveService{

	@Autowired
	CreditArchiveRepository creditArchiveRep;

	public CreditArchiveRepository getCreditArchiveRep() {
		return creditArchiveRep;
	}

	public void setCreditArchiveRep(CreditArchiveRepository creditArchiveRep) {
		this.creditArchiveRep = creditArchiveRep;
	}
	
}
