package tn.esprit.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EPARGNE")
public class CompteEpargne extends Compte implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private float tauxInteret;

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(float tauxInteret) {
		super();
		this.tauxInteret = tauxInteret;
	}

	public float getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(float tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	
	@Override
	public String toString() {
		return super.toString()+" CompteEpargne [tauxInteret=" + tauxInteret + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
