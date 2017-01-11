package fr.demos.cinepantin.entities;


public class LignePanier {
	private Article article;
	// je veut commande un ou plusieur Article
	private int quantite;


	public LignePanier(Article article, int quantite) {
		this.article = article;
		this.quantite = quantite;
	}
	
	public void addQuantity(int quantite){
		this.quantite += quantite;
	}

	public int getQuantite() {
		return quantite;
	}

	public Article getArticle() {
		return article;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

}
