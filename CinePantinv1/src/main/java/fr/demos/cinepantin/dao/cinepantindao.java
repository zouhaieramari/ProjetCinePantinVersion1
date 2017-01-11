package fr.demos.cinepantin.dao;

import java.util.List;

import fr.demos.cinepantin.entities.*;

public interface cinepantindao {

	public Long ajouterArticle(Article a, Long idAr);

	public void supprimerArticle(Long ida);

	public void modifierArticle(Article a);

	public List<Article> listarticles();

	public List<Article> articlesParMotCle(String mc);

	public List<Article> articlesSelectionnes();

	public Article getArticle(Long ida);

	
	
	
	
	
	public void ajouterUser(User u);

	public void attribuerRole(Role r, Long userID);

	public Commande enregistrerCommande(LigneCommande l, Client c);

}