package fr.demos.cinepantin.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//enrigistre le panier temporairement dans un fichier
public class Panier implements Serializable {

	private List<LignePanier> lignesPanier;

	public void addArticle(Article article, int quantite) {
		// TODO ajouter gestion des stocks et envoi d'exception

		int nbLignes = lignesPanier.size();
		LignePanier tmpLigne;
		for (int i = 0; i < nbLignes; i++) {
			tmpLigne = lignesPanier.get(i);
			// On recherche dans les lignes du panier si l'article est deja
			// present
			if ((tmpLigne.getArticle().getIdArticle()) == article.getIdArticle()) {
				// Une ligne existe deja avec cet article dans le panier
				System.out.println("Ligne existante : " + tmpLigne.getQuantite() + " / " + quantite);
				tmpLigne.addQuantity(quantite);
				return;
			}
		}
		// Il s'agit donc d'un nouvel article a ajouter au panier
		System.out.println("Ajout nouvel Article : ");
		lignesPanier.add(new LignePanier(article, quantite));
		System.out
				.println("Nb Articles panier : " + this.getNbPanier() + " lignesPanier.size : " + lignesPanier.size());

	}

	public int getNbPanier() {
		// cette fonction renvoie le nombre d'elements dans le panier
		int nbArticle = 0;
		for (LignePanier ligne : lignesPanier) {
			nbArticle += ligne.getQuantite();
		}
		System.out.println("Nb elements Panier = " + nbArticle);
		return nbArticle;
	}

	public double getPrixPanier() {
		double prixTotal = 0.0;
		int nbArticle = 0;
		double prixUnitaire = 0.0;

		for (LignePanier ligne : lignesPanier) {
			nbArticle = ligne.getQuantite();
			prixUnitaire = ligne.getArticle().getPrixHT();
			prixTotal = prixTotal + prixUnitaire * nbArticle;
		}

		return prixTotal;
	}

	public void deleteLigneByIdArticle(long idArticleAsupprimer) {

		// on initialise le numero de ligne a supprimer a -1
		int numLigneToDelete = -1;
		// connaitre le nombre de ligne dans Panier
		int nbLignes = lignesPanier.size();
		LignePanier tmpLigne;
		// parcourire le panier
		for (int i = 0; i < nbLignes; i++) {

			tmpLigne = lignesPanier.get(i);
			// On recherche dans les lignes du panier si l'article est deja
			// present
			if ((tmpLigne.getArticle().getIdArticle()) == idArticleAsupprimer) {
				numLigneToDelete = i;
			}
		}
		if (numLigneToDelete >= 0) {
			lignesPanier.remove(numLigneToDelete);
		}

	}

	public Panier() {
		lignesPanier = new ArrayList<LignePanier>();
	}

	public List<LignePanier> getLignesPanier() {
		return lignesPanier;
	}

}
