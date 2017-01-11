package fr.demos.cinepantin.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.demos.cinepantin.entities.Article;
import fr.demos.cinepantin.entities.Client;
import fr.demos.cinepantin.entities.Commande;
import fr.demos.cinepantin.entities.LigneCommande;
import fr.demos.cinepantin.entities.Panier;
import fr.demos.cinepantin.entities.Role;
import fr.demos.cinepantin.entities.User;

public class cinepantindaoimpl implements cinepantindao {
	@PersistenceContext
	private EntityManager em;

	public cinepantindaoimpl() {
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public Long ajouterArticle(Article ar, Long idAr) {
		Article a=getArticle(idAr); 
		em.persist(a);
		return ar.getIdArticle();
	}


	@Override
	public void supprimerArticle(Long ida) {
		Article a = em.find(Article.class, ida);
		em.remove(a);
		
	}

	@Override
	public void modifierArticle(Article a) {
		em.merge(a);
	}

	@Override
	public List<Article> listarticles() {
		Query req=em.createQuery("select a from Article a");
		
		return req.getResultList();
	}

	@Override
	public List<Article> articlesParMotCle(String mc) {
Query req=em.createQuery("select a from Article a where a.intitule like :x or a.discriptif like :x");
		req.setParameter("x", "%+mc+%");
		return req.getResultList();
	}

	@Override
	
	// a refaire a modifier selected dans article pas dans livre
	public List<Article> articlesSelectionnes() {
Query req=em.createQuery("select a from Article a where a.selected= true");
		
		return req.getResultList();
	}

	@Override
	public Article getArticle(Long ida) {
		
		return em.find(Article.class, ida);
	}

	@Override
	public void ajouterUser(User u) {
		em.persist(u);
		
	}

	@Override
	public void attribuerRole(Role r, Long userID) {
		User u = em.find(User.class, userID );
		u.getRoles().add(r);
		em.persist(r);
		
	}

	@Override
	public Commande enregistrerCommande(LigneCommande l, Client c) {
		// TODO Auto-generated method stub
		em.persist(c);
		Commande cmd = new Commande();
		cmd.setDateCommande(new Date());
		//cmd.setItems(l.getItems());
		return null;
	}




}
