package tn.esprit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Intervention implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	private Date dateIntervention = new Date();

	private String contenuIntervention;

	@Enumerated(EnumType.STRING)
	private TypeIntervention typeInter;

	@ManyToOne
	private Client client;

	public Intervention() {
		super();
	}

	public Intervention(String contenuIntervention, TypeIntervention typeInter) {
		super();
		this.contenuIntervention = contenuIntervention;
		this.typeInter = typeInter;
	}

	public int getId() {
		return id;
	}

	public Date getDateIntervention() {
		return dateIntervention;
	}

	public void setDateIntervention(Date dateIntervention) {
		this.dateIntervention = dateIntervention;
	}

	public String getContenuIntervention() {
		return contenuIntervention;
	}

	public void setContenuIntervention(String contenuIntervention) {
		this.contenuIntervention = contenuIntervention;
	}

	public TypeIntervention getTypeInter() {
		return typeInter;
	}

	public void setTypeInter(TypeIntervention typeInter) {
		this.typeInter = typeInter;
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
		return "Intervention [id=" + id + ", dateIntervention=" + dateIntervention + ", contenuIntervention="
				+ contenuIntervention + ", typeInter=" + typeInter + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contenuIntervention == null) ? 0 : contenuIntervention.hashCode());
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
		Intervention other = (Intervention) obj;
		if (contenuIntervention == null) {
			if (other.contenuIntervention != null)
				return false;
		} else if (!contenuIntervention.equals(other.contenuIntervention))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}
