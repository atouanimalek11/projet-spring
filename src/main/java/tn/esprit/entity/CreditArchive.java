package tn.esprit.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CreditArchive implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;

	private int duree;
	private float montantCredit;
	private float montantMensuelRelever;
	private float tauxTMM = 6.23f;
	private float tauxInteret;

	@OneToOne
	private Client client;

	public CreditArchive() {
		super();
	}

	
	public CreditArchive(int dure, float montantCredit, float montantMensuelRelever, float tauxTMM, float tauxInteret) {
		super();
		this.duree = dure;
		this.montantCredit = montantCredit;
		this.montantMensuelRelever = montantMensuelRelever;
		this.tauxTMM = tauxTMM;
		this.tauxInteret = tauxInteret;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}


	public int getId() {
		return id;
	}

	public float getMontantCredit() {
		return montantCredit;
	}

	public void setMontantCredit(float montantCredit) {
		this.montantCredit = montantCredit;
	}

	public float getMontantMensuelRelever() {
		return montantMensuelRelever;
	}

	public void setMontantMensuelRelever(float montantMensuelRelever) {
		this.montantMensuelRelever = montantMensuelRelever;
	}

	public float getTauxTMM() {
		return tauxTMM;
	}

	public void setTauxTMM(float tauxTMM) {
		this.tauxTMM = tauxTMM;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public float getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(float tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CreditArchive [id=" + id + ", duree=" + duree + ", montantCredit=" + montantCredit
				+ ", montantMensuelRelever=" + montantMensuelRelever + ", tauxTMM=" + tauxTMM + ", tauxInteret="
				+ tauxInteret + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditArchive other = (CreditArchive) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
