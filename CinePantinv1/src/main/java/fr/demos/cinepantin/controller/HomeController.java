package fr.demos.cinepantin.controller;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.demos.cinepantin.dao.ClientDao;
import fr.demos.cinepantin.dao.LivreDao;
import fr.demos.cinepantin.entities.Client;
import fr.demos.cinepantin.entities.Livre;
import fr.demos.cinepantin.entities.Panier;

/**
 * Handles requests for the application home page.
 */
@Controller
@Scope("session")
public class HomeController implements Serializable {
	@Autowired
	private Panier panier;
	@Autowired
	private LivreDao dao;
	@Autowired
	private ClientDao dao1;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
//	@RequestMapping(value = "/home.htm", method = RequestMethod.GET)
//	public String affichePage3(ModelMap model) {
//		
//		try {
//			int pageCourante = 1;
//			List<Livre> liste1 = dao.selectAcceuil(pageCourante, 3);
//			List<Livre> liste2 = dao.selectAcceuil(pageCourante+1, 3);
//			List<Livre> liste3 = dao.selectAcceuil(pageCourante+2, 3);
//			model.addAttribute("liste1", liste1);
//			model.addAttribute("liste2", liste2);
//			model.addAttribute("liste3", liste3);
//			System.out.println("Liste 1 size : "+liste1.size());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		return "acceuil";
//	}
	
	//@RequestMapping(value = "/home.htm", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);

		//Date date = new Date();
		//DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		//String formattedDate = dateFormat.format(date);

	//	model.addAttribute("serverTime", formattedDate);
//		try {
//			List<Livre> liste = dao.selectventeflash();
//			model.addAttribute("liste", liste);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Panier Home = "+panier);
	//	return "acceuil";
//	}
	@RequestMapping(value = "/home.htm", method = RequestMethod.GET)
	public String affichageAcceuil(ModelMap model) {
		try {
			int pageCourante = 1;
			List<Livre> liste1 = dao.selectAcceuil(pageCourante, 3);
			List<Livre> liste2 = dao.selectAcceuil(pageCourante+1, 3);
			List<Livre> liste3 = dao.selectAcceuil(pageCourante+2, 3);
			model.addAttribute("liste1", liste1);
			model.addAttribute("liste2", liste2);
			model.addAttribute("liste3", liste3);
			System.out.println("Liste 1 size : "+liste1.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Panier Vente flash = " + panier);
		return "acceuil";
	}
	@RequestMapping(value = "/ajouter.htm", method = RequestMethod.POST)
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
		System.out.println("Livre ajout� !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! : " + panier.getNbPanier());
		updatePanier(model);

		return "acceuil";
	}
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

	@RequestMapping(value = "/panier.htm", method = RequestMethod.GET)
	public String panier(ModelMap model) {
		// methode updatePanier pour metre a jour le panier apres supprission
		updatePanier(model);
		return "panier";
	}

}
