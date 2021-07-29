package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Facture implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(unique=true)
	private String reference;
	
	@Temporal(TemporalType.DATE)
	private Date dateFacture;
	
	private float montantHT;
	
	private float remise;
	
	private float tauxTVA;
	
	@ManyToOne
	private Client client;
	
	private float montantTTC;

	public Facture() {
		super();
	}

	public Facture(String reference, Date dateFacture, float montantHT, float remise, float tauxTVA, float montantTTC) {
		super();
		this.reference = reference;
		this.dateFacture = dateFacture;
		this.montantHT = montantHT;
		this.remise = remise;
		this.tauxTVA = tauxTVA;
		this.montantTTC = montantTTC;
	}

	public int getId() {
		return id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public float getMontantHT() {
		return montantHT;
	}

	public void setMontantHT(float montantHT) {
		this.montantHT = montantHT;
	}

	public float getRemise() {
		return remise;
	}

	public void setRemise(float remise) {
		this.remise = remise;
	}

	public float getTauxTVA() {
		return tauxTVA;
	}

	public void setTauxTVA(float tauxTVA) {
		this.tauxTVA = tauxTVA;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public float getMontantTTC() {
		return montantTTC;
	}

	public void setMontantTTC(float montantTTC) {
		this.montantTTC = montantTTC;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Facture [id=" + id + ", reference=" + reference + ", dateFacture=" + dateFacture + ", montantHT="
				+ montantHT + ", remise=" + remise + ", tauxTVA=" + tauxTVA + ", montantTTC=" + montantTTC + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((reference == null) ? 0 : reference.hashCode());
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
		Facture other = (Facture) obj;
		if (id != other.id)
			return false;
		if (reference == null) {
			if (other.reference != null)
				return false;
		} else if (!reference.equals(other.reference))
			return false;
		return true;
	}
	
}
