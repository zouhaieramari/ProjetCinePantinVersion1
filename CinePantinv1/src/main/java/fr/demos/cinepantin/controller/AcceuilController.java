package fr.demos.cinepantin.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.demos.cinepantin.dao.LivreDao;
import fr.demos.cinepantin.entities.Livre;
import fr.demos.cinepantin.entities.Panier;

@Controller
@Scope("session")
public class AcceuilController implements Serializable {
	@Autowired
	private LivreDao dao;
	@Autowired
	private Panier panier;

	public AcceuilController() {
		// TODO Auto-generated constructor stub
	}

	// panier .......................
	@RequestMapping(value = "/produitajouterpanier.htm", method = RequestMethod.POST)
	public String ajoutpanier(ModelMap model, @RequestParam("idArticle") Long idArticle) {

		Livre livre = null;
		System.out.println("Pret a ajouter !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! : " + idArticle);
		try {
			livre = dao.findById(idArticle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panier.addArticle(livre, 1);
		System.out.println("Livre ajouté !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! : " + panier.getNbPanier());
		updatePanier(model);

		return "panier";
	}
	@RequestMapping(value = "/supprimerDuPanier.htm", method = RequestMethod.GET)
	public String supprimerDuPanier(ModelMap model, @RequestParam("idArticlerecupere") long idArticle) {
		System.out.println("test pour afficher l idArtricle " + idArticle);
		// TODO
		panier.deleteLigneByIdArticle(idArticle);
		// methgode updatePanier pour metre a jour le panier apres supprission
		updatePanier(model);
		return "panier";
	}

	// methode pour metre a jour le panier apres la supprission pour evite le
	// redandence c a d de reecrire ce trois ligne a chaque fois
	private void updatePanier(ModelMap model) {
		model.addAttribute("nbPanier", panier.getNbPanier());
		model.addAttribute("prixPanier", panier.getPrixPanier());
		model.addAttribute("listeLignes", panier.getLignesPanier());
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	@RequestMapping(value = "/produitajouterpanier.htm", method = RequestMethod.GET)
	public String affichageajoutpanier(ModelMap model) {

		return "resultaajoutpanier";
	}

	@RequestMapping(value = "/venteflash.htm", method = RequestMethod.GET)
	public String venteflash(ModelMap model) {
		try {
			List<Livre> liste = dao.selectventeflash();
			model.addAttribute("liste", liste);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Panier Vente flash = " + panier);
		return "venteflash";
	}

	@RequestMapping(value = "/panier.htm", method = RequestMethod.GET)
	public String panier(ModelMap model) {
		// methode updatePanier pour metre a jour le panier apres supprission
		updatePanier(model);
		return "panier";
	}

	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/guideachat.htm", method = RequestMethod.GET)
	public String affichePage3(ModelMap model) {
		return "guideachat";
	}
	@RequestMapping(value = "/contact.htm", method = RequestMethod.GET)
	public String contact(ModelMap model) {
	
		return "contact";
	}


}
