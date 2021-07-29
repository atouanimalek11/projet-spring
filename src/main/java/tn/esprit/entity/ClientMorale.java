package tn.esprit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MORALE")
public class ClientMorale extends Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String matriculeFiscal;
	
	private String libelle;

	
	private String raisonSociale;
	
	private String categorie;

	
	public ClientMorale() {
		super();
	}

	public ClientMorale(int telephone, int fax, String adresseEmail, String adresse, String mat, String lib, String rSocial, String cat) {
		super(telephone, fax, adresseEmail, adresse);
		matriculeFiscal = mat;
		libelle = lib;
		raisonSociale = rSocial;
		categorie = cat;
	}

	public String getMatriculeFiscal() {
		return matriculeFiscal;
	}

	public void setMatriculeFiscal(String matriculeFiscal) {
		this.matriculeFiscal = matriculeFiscal;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return super.toString()+" ClientMorale [matriculeFiscal=" + matriculeFiscal + ", libelle=" + libelle + ", raisonSociale="
				+ raisonSociale + ", categorie=" + categorie + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
