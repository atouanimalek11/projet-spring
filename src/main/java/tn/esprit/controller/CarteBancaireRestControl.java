package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.CarteBancaireService;

@RestController
public class CarteBancaireRestControl {
	@Autowired
	CarteBancaireService carteBancaireServ;

	public CarteBancaireService getCarteBancaireServ() {
		return carteBancaireServ;
	}

	public void setCarteBancaireServ(CarteBancaireService carteBancaireServ) {
		this.carteBancaireServ = carteBancaireServ;
	}

}
