package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Operation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id 
	private int id;
	
	@Column(unique = true)
	private String reference;
	
	private int montant;
	
	@Enumerated(EnumType.STRING)
	private TypeOperation typeOperation;

	@Enumerated(EnumType.STRING)
	private NatureOperation natureOperation;
	
	@Temporal(TemporalType.DATE)
	private Date dateOperation = new Date();

	@ManyToOne
	private Compte compte;

	public Operation() {
		super();
	}

	public Operation(String reference, int montant, TypeOperation typeOperation, NatureOperation natureOperation,
			Date dateOperation) {
		super();
		this.reference = reference;
		this.montant = montant;
		this.typeOperation = typeOperation;
		this.natureOperation = natureOperation;
		this.dateOperation = dateOperation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public TypeOperation getTypeOperation() {
		return typeOperation;
	}

	public void setTypeOperation(TypeOperation typeOperation) {
		this.typeOperation = typeOperation;
	}

	public NatureOperation getNatureOperation() {
		return natureOperation;
	}

	public void setNatureOperation(NatureOperation natureOperation) {
		this.natureOperation = natureOperation;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	@Override
	public String toString() {
		return "Operation [id=" + id + ", reference =" + reference + ", montant=" + montant + ", typeOperation="
				+ typeOperation + ", natureOperation=" + natureOperation + ", dateOperation=" + dateOperation + "]";
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
		Operation other = (Operation) obj;
		if (id != other.id)
			return false;
		if (reference == null) {
			if (other.reference != null)
				return false;
		} else if (!reference.equals(other.reference))
			return false;
		return true;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
