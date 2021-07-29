package tn.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.CarteBancaireRepository;

@Service
public class CarteBancaireServiceImpl implements CarteBancaireService {
	@Autowired
	CarteBancaireRepository carteBancaireRep;

	public CarteBancaireRepository getCarteBancaireRep() {
		return carteBancaireRep;
	}

	public void setCarteBancaireRep(CarteBancaireRepository carteBancaireRep) {
		this.carteBancaireRep = carteBancaireRep;
	}
	
}
