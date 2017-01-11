package fr.demos.cinepantin.metier;

import java.util.List;
import fr.demos.cinepantin.entities.*;

public interface Internaute {

	public List<Article> listArticles();

	public Article getArticle(Long idAr);

	public List<Article> ArticlesParMotCle(String mc);

	public List<Article> ArticlesSelectionnes();

	public Commande enregistrerCommande(Panier p, Client c);
}