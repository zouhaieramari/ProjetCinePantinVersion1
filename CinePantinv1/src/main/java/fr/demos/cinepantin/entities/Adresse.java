package fr.demos.cinepantin.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Adresse implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAdresse;
	@NotEmpty
	private String rue;
	@NotNull
	private int codePostale;
	@NotEmpty
	private String ville;
	@NotEmpty
	private String pays;

	
	public String getRue() {
		return rue;
	}


	public void setRue(String rue) {
		this.rue = rue;
	}



	public int getCodePostale() {
		return codePostale;
	}


	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public Adresse() {
		// TODO Auto-generated constructor stub
	}

}
