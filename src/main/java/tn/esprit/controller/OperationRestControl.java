package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.OperationService;

@RestController
public class OperationRestControl {

	@Autowired
	OperationService operationServ;

	public OperationService getOperationServ() {
		return operationServ;
	}

	public void setOperationServ(OperationService operationServ) {
		this.operationServ = operationServ;
	}

}
