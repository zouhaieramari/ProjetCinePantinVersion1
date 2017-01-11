package fr.demos.cinepantin.metier;

import fr.demos.cinepantin.entities.*;
//interface  admin article
public interface IAArticles extends Internaute {

	public Long ajouterArticle(Article a, Long idAr);

	public void supprimerArticle(Long idA);

	public void modifierArticle(Article a);

	public void ajouterUser(User u);

	public void attribuerRole(Role r, Long userID);
}
