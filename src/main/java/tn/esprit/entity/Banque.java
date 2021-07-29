package tn.esprit.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Banque implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String libelle;

	@Column(unique = true)
	private int telephone;

	@Column(unique = true, nullable = true)
	private int fax;

	@Column(unique = true)
	private String email;

	private String abreviation;

	private String adresse;

	private String categorie;

	@OneToMany(mappedBy = "banque", cascade = { CascadeType.PERSIST, CascadeType.REMOVE }, fetch = FetchType.EAGER)
	private List<Agence> agences;

	@OneToMany(mappedBy = "banque", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private List<PackProduit> packProduits;

	public Banque() {
		super();
	}

	public Banque(String libelle, int telephone, int fax, String email, String abreviation, String adresse,
			String categorie) {
		super();
		this.libelle = libelle;
		this.telephone = telephone;
		this.fax = fax;
		this.email = email;
		this.abreviation = abreviation;
		this.adresse = adresse;
		this.categorie = categorie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public int getFax() {
		return fax;
	}

	public void setFax(int fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAbreviation() {
		return abreviation;
	}

	public void setAbreviation(String abreviation) {
		this.abreviation = abreviation;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public List<Agence> getAgences() {
		return agences;
	}

	public void setAgences(List<Agence> agences) {
		this.agences = agences;
	}

	public List<PackProduit> getPackProduits() {
		return packProduits;
	}

	public void setPackProduits(List<PackProduit> packProduits) {
		this.packProduits = packProduits;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abreviation == null) ? 0 : abreviation.hashCode());
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
		Banque other = (Banque) obj;
		if (abreviation == null) {
			if (other.abreviation != null)
				return false;
		} else if (!abreviation.equals(other.abreviation))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}
