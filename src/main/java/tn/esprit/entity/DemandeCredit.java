package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DemandeCredit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String categorie;
	
	private float revenuMensuel;
	
	private float autresRevenuM;
	
	private float montantCreditEncours;
	
	private int duree;
	
	private float montantReleverMois;
	
	@Temporal(TemporalType.DATE)
	private Date dateDemande = new Date();
	
	@Enumerated(EnumType.STRING)
	private EtatDemande etat = EtatDemande.ENCOURS;
	
	@ManyToOne
	private Client client;
	
	public DemandeCredit() {
		super();
	}

	public DemandeCredit(String categorie, float revenuMensuel, float autresRevenuM, float montantCreditEncours,
			int duree, float montantReleverMois) {
		super();
		this.categorie = categorie;
		this.revenuMensuel = revenuMensuel;
		this.autresRevenuM = autresRevenuM;
		this.montantCreditEncours = montantCreditEncours;
		this.duree = duree;
		this.montantReleverMois = montantReleverMois;
	}

	public int getId() {
		return id;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public float getRevenuMensuel() {
		return revenuMensuel;
	}

	public void setRevenuMensuel(float revenuMensuel) {
		this.revenuMensuel = revenuMensuel;
	}

	public float getAutresRevenuM() {
		return autresRevenuM;
	}

	public void setAutresRevenuM(float autresRevenuM) {
		this.autresRevenuM = autresRevenuM;
	}

	public float getMontantCreditEncours() {
		return montantCreditEncours;
	}

	public void setMontantCreditEncours(float montantCreditEncours) {
		this.montantCreditEncours = montantCreditEncours;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public float getMontantReleverMois() {
		return montantReleverMois;
	}

	public void setMontantReleverMois(float montantReleverMois) {
		this.montantReleverMois = montantReleverMois;
	}

	public Date getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

	public EtatDemande getEtat() {
		return etat;
	}

	public void setEtat(EtatDemande etat) {
		this.etat = etat;
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

	@Override
	public String toString() {
		return "DemandeCredit [id=" + id + ", categorie=" + categorie + ", revenuMensuel=" + revenuMensuel
				+ ", autresRevenuM=" + autresRevenuM + ", montantCreditEncours=" + montantCreditEncours + ", duree="
				+ duree + ", montantReleverMois=" + montantReleverMois + ", dateDemande=" + dateDemande + ", etat="
				+ etat + "]";
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
		DemandeCredit other = (DemandeCredit) obj;
		if (id != other.id)
			return false;
		return true;
	}	

}
