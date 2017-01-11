package fr.demos.cinepantin.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class LigneCommande implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	// un ligne de commande correspond a un livre
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	// je veut commander un ou plusieur livre 
	private int quantite;
	// je veut commander un livre avec un prix
	private double prix;
	//une ligne de commande correspond a une commande relation bidirectionelle
	@ManyToOne
	@JoinColumn(name="idCommande")
	private Commande commande;
	
	
	
	public LigneCommande(int quantite, double prix) {
		super();
		this.quantite = quantite;
		this.prix = prix;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Long getIdCommande() {
		return id;
	}

	public void setIdCommande(Long idCommande) {
		this.id = id;
	}

	

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public LigneCommande() {
		// TODO Auto-generated constructor stub
	}

}
