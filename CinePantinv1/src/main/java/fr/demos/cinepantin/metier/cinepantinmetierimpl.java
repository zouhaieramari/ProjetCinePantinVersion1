package fr.demos.cinepantin.metier;

import java.util.List;

import fr.demos.cinepantin.dao.cinepantindao;
import fr.demos.cinepantin.entities.Article;
import fr.demos.cinepantin.entities.Client;
import fr.demos.cinepantin.entities.Commande;
import fr.demos.cinepantin.entities.Panier;
import fr.demos.cinepantin.entities.Role;
import fr.demos.cinepantin.entities.User;

public class cinepantinmetierimpl implements IAArticles {

	private cinepantindao dao;

	public void setDao(cinepantindao dao) {
		this.dao = dao;
	}

	public cinepantinmetierimpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Article> listArticles() {
		
		return dao.listarticles();
	}

	@Override
	public Article getArticle(Long idAr) {
		
		return dao.getArticle(idAr);
	}

	@Override
	public List<Article> ArticlesParMotCle(String mc) {
		
		return dao.articlesParMotCle(mc);
	}

	@Override
	public List<Article> ArticlesSelectionnes() {
		
		return dao.articlesSelectionnes();
	}
// a voir..................................................
	@Override
	public Commande enregistrerCommande(Panier p , Client c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long ajouterArticle(Article a, Long idAr) {
		return dao.ajouterArticle(a, idAr);
	}

	@Override
	public void supprimerArticle(Long idA) {
		dao.supprimerArticle(idA);
	}

	@Override
	public void modifierArticle(Article a) {
dao.modifierArticle(a);
	}

	@Override
	public void ajouterUser(User u) {
		dao.ajouterUser(u);

	}

	@Override
	public void attribuerRole(Role r, Long userID) {
		dao.attribuerRole(r, userID);

	}

}
