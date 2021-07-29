package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ClientPotentiel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Enumerated(EnumType.STRING)
	private TypeClient typeClient;

	private int telephone;

	
	private int fax;

	protected String adresseEmail;

	protected String adresse;

	@Enumerated(EnumType.STRING)
	private EtatDemande etat = EtatDemande.ENCOURS;

	@Temporal(TemporalType.DATE)
	protected Date dateDemande = new Date();

	
	private Long cin;

	
	private String numPasseport;

	private String nom;

	private String prenom;

	@Temporal(TemporalType.DATE)
	private Date dateNaissance;

	@Enumerated(EnumType.STRING)
	private Genre genre;

	private String etatCivil;

	private String profession;


	private String matriculeFiscal;

	private String libelle;

	private String raisonSociale;

	private String categorie;

	public ClientPotentiel() {
		super();
	}

	

	public ClientPotentiel(int telephone, int fax, String adresseEmail, String adresse, Long cin, String numPasseport,
			String nom, String prenom, Date dateNaissance, Genre genre, String etatCivil, String profession) {
		super();
		this.telephone = telephone;
		this.fax = fax;
		this.adresseEmail = adresseEmail;
		this.adresse = adresse;
		this.cin = cin;
		this.numPasseport = numPasseport;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.genre = genre;
		this.etatCivil = etatCivil;
		this.profession = profession;
	}

	public ClientPotentiel(int telephone, int fax, String adresseEmail, String adresse, String matriculeFiscal,
			String libelle, String raisonSociale, String categorie) {
		super();
		this.telephone = telephone;
		this.fax = fax;
		this.adresseEmail = adresseEmail;
		this.adresse = adresse;
		this.matriculeFiscal = matriculeFiscal;
		this.libelle = libelle;
		this.raisonSociale = raisonSociale;
		this.categorie = categorie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TypeClient getTypeClient() {
		return typeClient;
	}

	public void setTypeClient(TypeClient typeClient) {
		this.typeClient = typeClient;
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

	public String getAdresseEmail() {
		return adresseEmail;
	}

	public void setAdresseEmail(String adresseEmail) {
		this.adresseEmail = adresseEmail;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public EtatDemande getEtat() {
		return etat;
	}

	public void setEtat(EtatDemande etat) {
		this.etat = etat;
	}

	public Date getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

	public Long getCin() {
		return cin;
	}

	public void setCin(Long cin) {
		this.cin = cin;
	}

	public String getNumPasseport() {
		return numPasseport;
	}

	public void setNumPasseport(String numPasseport) {
		this.numPasseport = numPasseport;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getEtatCivil() {
		return etatCivil;
	}

	public void setEtatCivil(String etatCivil) {
		this.etatCivil = etatCivil;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
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
		return "ClientPotentiel [id=" + id + ", typeClient=" + typeClient + ", telephone=" + telephone + ", fax=" + fax
				+ ", adresseEmail=" + adresseEmail + ", adresse=" + adresse + ", etat=" + etat + ", dateDemande="
				+ dateDemande + ", cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", matriculeFiscal="
				+ matriculeFiscal + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cin == null) ? 0 : cin.hashCode());
		result = prime * result + id;
		result = prime * result + ((matriculeFiscal == null) ? 0 : matriculeFiscal.hashCode());
		result = prime * result + ((numPasseport == null) ? 0 : numPasseport.hashCode());
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
		ClientPotentiel other = (ClientPotentiel) obj;
		if (cin == null) {
			if (other.cin != null)
				return false;
		} else if (!cin.equals(other.cin))
			return false;
		if (id != other.id)
			return false;
		if (matriculeFiscal == null) {
			if (other.matriculeFiscal != null)
				return false;
		} else if (!matriculeFiscal.equals(other.matriculeFiscal))
			return false;
		if (numPasseport == null) {
			if (other.numPasseport != null)
				return false;
		} else if (!numPasseport.equals(other.numPasseport))
			return false;
		return true;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
