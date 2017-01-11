package fr.demos.cinepantin.controller;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.demos.cinepantin.dao.LivreDao;
import fr.demos.cinepantin.entities.Livre;

@Controller
public class LivreController implements Serializable {

	@Autowired
	private LivreDao dao;

	public LivreController() {
		// TODO Auto-generated constructor stub
	}

	// recupere le formulaire  a l aide de methode GET
	@RequestMapping(value = "/ajouterArticle.htm", method = RequestMethod.GET)
	public String homeajouarticle(Locale locale, Model model) {
		Livre l = new Livre();
		model.addAttribute("livre", l);
		return "saisieArticle";
	}
	// envoyer le fromulaire  a  l aide de methode post 
	@RequestMapping(value = "/ajouterArticle.htm", method = RequestMethod.POST)
	// @Valid Livre l ....pour la validation de formulaire  par spring si il ya de faute on affiche les messages d erreurs 
	public String traitementSaisie(ModelMap model, @ModelAttribute("livre") @Valid Livre l, BindingResult result)   {

		//si non validation de formulaire on affiche le meme page saisieArticle
		if (result.hasErrors()) {
			
			return "saisieArticle";
			
		} else {
			try {
				// si le formulaire et bien rempli en stocke les donnees dans la base de donnee
				dao.insert(l);
								
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			model.addAttribute("showConfirmationDialog", "true");
			model.addAttribute("titreDialogue", "Confirmation Saisie Article");
			model.addAttribute("texteDialogue", "Article bien saisie!");
			// le client est r�cup�r�: on peut lz sauvgarder dans la base de
			// donnees
			// on retourne le nom de la vue a afficher
			// System.out.println("nom client: " +cli.getNom());
			
			//try {
				//List<Livre> liste = dao.selecttout();
				//model.addAttribute("liste", liste);
			//} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			///}
			return "home";
		}
	}

	@RequestMapping(value = "/afficheArticle.htm", method = RequestMethod.GET)
	public String affichearticle(Locale locale, Model model ) {
		try {
			List<Livre> liste = dao.selecttout();
			model.addAttribute("liste", liste);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "affichagetoutarticle";
	}
	@InitBinder
	protected void initBinderPreparation(WebDataBinder binder) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

}
//@RequestMapping(value = "/saisieArtcile.htm", method = RequestMethod.GET)
//
//public String saisieArticle(ModelMap model) {
//
//	Livre l = new Livre();
//
//	model.addAttribute("livre", l);
//	// on retourne le nom de la vue a afficher
//
//	return "saisieArtcile";
//}
//

