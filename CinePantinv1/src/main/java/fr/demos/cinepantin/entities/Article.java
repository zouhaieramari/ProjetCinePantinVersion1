package fr.demos.cinepantin.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
// heritage.......... @Inheritance(strategy=InheritanceType.JOINED).......... Livre Herite de Article
@Inheritance(strategy=InheritanceType.JOINED)
public class Article implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idArticle;
	@NotEmpty
	private String intitule;
	@NotEmpty
	// descriptif doit contenir au moin 10 caractaire et au max 100
	@Size(min=10, max=5000)
	private String descriptif;
	@NotNull
	private int quantiteStock;
	
	private double prixHT=0.0;
	//on lui associe un champ binaire de grand taille donc on declare @Lob
	//@Lob
	//private byte[] image;
	private String nomPhoto;
	
	
	
	
	
	public Article(String intitule, String descriptif, int quantiteStock, double prixHT, byte[] image, String nomPhoto) {
		super();
		this.intitule = intitule;
		this.descriptif = descriptif;
		this.quantiteStock = quantiteStock;
		this.prixHT = prixHT;
		///this.image = image;
		this.nomPhoto = nomPhoto;
	}

//	public byte[] getImage() {
//		return image;
//	}
//
//	public void setImage(byte[] image) {
//		this.image = image;
//	}

	public String getNomPhoto() {
		return nomPhoto;
	}

	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}

	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public int getQuantiteStock() {
		return quantiteStock;
	}

	public void setQuantiteStock(int quantiteStock) {
		this.quantiteStock = quantiteStock;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public Article() {
		// TODO Auto-generated constructor stub
	}

}
