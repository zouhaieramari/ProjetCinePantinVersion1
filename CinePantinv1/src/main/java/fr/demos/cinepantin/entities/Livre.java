package fr.demos.cinepantin.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.NotEmpty;

@Entity

public class Livre extends Article implements Serializable {
	
	
	@NotEmpty
	private String ISBN;
	@NotEmpty
	private String titre;
	@NotEmpty
	private String auteur;
	@NotEmpty
	private String editeur;
	@NotNull
	private int nombrePage;
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date anneeParution;
	private boolean selected;
	// on va stocker l'adresse du photo

		
	
	
	///.............. constructeur essai
	
	public Livre(String ISBN,  String auteur, String editeur) {
		super();
		
		this.ISBN = ISBN;
		this.auteur = auteur;
		this.editeur = editeur;
		
	}
	//....................................
//	public Livre(String intitule, String descriptif, int quantiteStock, double prixHT, String image,  String iSBN, String titre, String auteur, String editeur, int nombrePage, int anneeParution,
//			boolean selected, String photo) {
//		super(intitule, descriptif, quantiteStock, prixHT);
//		
//		this.ISBN = iSBN;
//		this.titre = titre;
//		this.auteur = auteur;
//		this.editeur = editeur;
//		this.nombrePage = nombrePage;
//		this.anneeParution = anneeParution;
//		this.selected = selected;
//	}

	


	public boolean isSelected() {
		return selected;
	}



	public Livre(String intitule, String descriptif, int quantiteStock, double prixHT, byte[] image, String nomPhoto,
			String ISBN, String titre, String auteur, String editeur, int nombrePage, Date anneeParution,
			boolean selected) {
		super(intitule, descriptif, quantiteStock, prixHT, image, nomPhoto);
		this.ISBN = ISBN;
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.nombrePage = nombrePage;
		this.anneeParution = anneeParution;
		this.selected = selected;
	}
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Livre(String intitule, String descriptif, int quantiteStock, double prixHT, byte[] image,
			String nomPhoto) {
		super(intitule, descriptif, quantiteStock, prixHT, image, nomPhoto);
		// TODO Auto-generated constructor stub
	}




	public void setSelected(boolean selected) {
		this.selected = selected;
	}



	public String getISBN() {
		return ISBN;
	}



	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}



	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public String getAuteur() {
		return auteur;
	}



	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}



	public String getEditeur() {
		return editeur;
	}



	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}



	public int getNombrePage() {
		return nombrePage;
	}



	public void setNombrePage(int nombrePage) {
		this.nombrePage = nombrePage;
	}


	public Date getAnneeParution() {
		return anneeParution;
	}



	public void setAnneeParution(Date anneeParution) {
		this.anneeParution = anneeParution;
	}



	//public Livre() {
		// TODO Auto-generated constructor stub
	//}

}
