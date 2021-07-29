package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CarteBancaire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private Long numCarte;

	private boolean isValid = true;

	@Enumerated(EnumType.STRING)
	private TypeCarte typeCarte;

	@Temporal(TemporalType.DATE)
	private Date dateValidation;

	@OneToOne(mappedBy = "carteBancaire")
	private CompteCourant compteCourant;

	public CarteBancaire() {
		super();
	}

	public CarteBancaire(Long numCarte, TypeCarte typeCarte, Date dateValidation) {
		super();
		this.numCarte = numCarte;
		this.typeCarte = typeCarte;
		this.dateValidation = dateValidation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getNumCarte() {
		return numCarte;
	}

	public void setNumCarte(Long numCarte) {
		this.numCarte = numCarte;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public TypeCarte getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(TypeCarte typeCarte) {
		this.typeCarte = typeCarte;
	}

	public Date getDateValidation() {
		return dateValidation;
	}

	public void setDateValidation(Date dateValidation) {
		this.dateValidation = dateValidation;
	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CarteBancaire [id=" + id + ", numCarte=" + numCarte + ", isValid=" + isValid + ", typeCarte="
				+ typeCarte + ", dateValidation=" + dateValidation + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((numCarte == null) ? 0 : numCarte.hashCode());
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
		CarteBancaire other = (CarteBancaire) obj;
		if (id != other.id)
			return false;
		if (numCarte == null) {
			if (other.numCarte != null)
				return false;
		} else if (!numCarte.equals(other.numCarte))
			return false;
		return true;
	}

}
