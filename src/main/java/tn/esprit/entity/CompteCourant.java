package tn.esprit.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("COURANT")
public class CompteCourant extends Compte implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int rib;
	
	private String iban;

	@OneToOne
	private CarteBancaire carteBancaire;
	
	public CompteCourant() {
		super();
	}

	public CompteCourant(int rib, String iban) {
		super();
		this.rib = rib;
		this.iban = iban;
	}

	public int getRib() {
		return rib;
	}

	public void setRib(int rib) {
		this.rib = rib;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public CarteBancaire getCarteBancaire() {
		return carteBancaire;
	}

	public void setCarteBancaire(CarteBancaire carteBancaire) {
		this.carteBancaire = carteBancaire;
	}

	@Override
	public String toString() {
		return super.toString()+" CompteCourant [rib=" + rib + ", iban=" + iban + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
