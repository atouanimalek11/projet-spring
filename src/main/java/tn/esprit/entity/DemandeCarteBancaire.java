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
public class DemandeCarteBancaire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String libelle;

	@Enumerated(EnumType.STRING)
	private TypeCarte typeCarte;

	@Enumerated(EnumType.STRING)
	private EtatDemande etat = EtatDemande.ENCOURS;
	
	@Temporal(TemporalType.DATE)
	protected Date dateDemande = new Date();
	
	@ManyToOne
	private CompteCourant compteCourant;
	
	public DemandeCarteBancaire() {
		super();
	}

	public DemandeCarteBancaire(String libelle, TypeCarte typeCarte) {
		super();
		this.libelle = libelle;
		this.typeCarte = typeCarte;
	}

	public int getId() {
		return id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public TypeCarte getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(TypeCarte typeCarte) {
		this.typeCarte = typeCarte;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DemandeCarteBancaire [id=" + id + ", libelle=" + libelle + ", typeCarte=" + typeCarte + ", etat=" + etat
				+ ", dateDemande=" + dateDemande + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
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
		DemandeCarteBancaire other = (DemandeCarteBancaire) obj;
		if (id != other.id)
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		return true;
	}

}
