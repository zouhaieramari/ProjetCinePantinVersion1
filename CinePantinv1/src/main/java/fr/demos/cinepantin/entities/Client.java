package fr.demos.cinepantin.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.validation.constraints.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Client implements Serializable {

	// l identifiant 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClient;
	@NotEmpty
	private String nom;
	// @NotEmpty pour dire que le champ n est pas vide
	@NotEmpty
	private String prenom;
	// pour une date on doit declare @NotNull  pour dire que le champ n est pas vide il faut rajouter aussi @Temporal(TemporalType.DATE)
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	// pour dire que le champ n est pas vide on doit declare @NotNull
	@NotNull
	private int telephone;
	@NotEmpty
	private String email;
	@NotEmpty
	private String passWord;
	// puisque le client possede une adresse qui est stocker dans une table adresse on doit faire le lien entre le deux table a l aide 
	// de @OneToOne(cascade={CascadeType.ALL})
	@OneToOne(cascade={CascadeType.ALL})
	private Adresse adresse;
	

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
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

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Client() {
		// TODO Auto-generated constructor stub
	}

}
