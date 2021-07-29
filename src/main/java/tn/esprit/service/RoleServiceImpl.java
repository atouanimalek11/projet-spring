package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository roleRep;

	public RoleRepository getRoleRep() {
		return roleRep;
	}

	public void setRoleRep(RoleRepository roleRep) {
		this.roleRep = roleRep;
	}
	
}
