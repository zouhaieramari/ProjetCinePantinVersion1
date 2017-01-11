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

import fr.demos.cinepantin.dao.ClientDao;
import fr.demos.cinepantin.entities.Client;

//@Controller indique qu'une classe est un contrôleur.
@Controller
public class ClientController implements Serializable {
	//Si l'autowiring est activé, Spring recherche automatiquement si un attribut ou un
	//argument de constructeur correspondent à un bean géré. Pour cela, Spring se base sur
	//des correspondances.
	@Autowired
	private ClientDao dao;

	public ClientController() {
		// TODO Auto-generated constructor stub
	}
	// @RequestMapping permet de mapper une méthode à une requête http.
	@RequestMapping(value = "/inscriptionclient.htm", method = RequestMethod.GET)

	public String affichePage(ModelMap model) {
		Client c = new Client();
		model.addAttribute("Client", c);
		// on retourne le nom de la vue a afficher
		return "inscriptionclient";
	}

	
	@RequestMapping(value = "/inscription.htm", method = RequestMethod.GET)
	public String homeinscriclient(Locale locale, Model model) {
		Client c = new Client();
		model.addAttribute("client", c);
		return "inscriptionclient";
	}

	
	//@ModelAttribute permet de mapper une variable à un élément du modèle.
	@RequestMapping(value = "/inscription.htm", method = RequestMethod.POST)
	public String traitementSaisie(ModelMap model, @ModelAttribute("client") @Valid Client c, BindingResult result)   {
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		if (result.hasErrors()) {
			return "inscriptionclient";
			
		} else {
			try {
				dao.insert(c);
				} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			model.addAttribute("showConfirmationDialog", "true");
			model.addAttribute("titreDialogue", "Confirmation Inscription");
			model.addAttribute("texteDialogue", "L'inscription de votre compte s est bien passee!");
			
			
			
			//${titreDialogue}
			// le client est r�cup�r�: on peut lz sauvgarder dans la base de
			// donnees
			// on retourne le nom de la vue a afficher
			// System.out.println("nom client: " +cli.getNom());
			
			
			
			
			try {
				List<Client> liste = dao.selecttout();
				model.addAttribute("liste", liste);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "home";
		}
	}

	@InitBinder
	protected void initBinderPreparation(WebDataBinder binder) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

}
