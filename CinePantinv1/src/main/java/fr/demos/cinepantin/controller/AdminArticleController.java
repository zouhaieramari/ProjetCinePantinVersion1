package fr.demos.cinepantin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.demos.cinepantin.entities.Article;
import fr.demos.cinepantin.metier.IAArticles;

@Controller
// tout les liens pour aller ver admin article commenc par adminAr
@RequestMapping(value="/adminAr")
public class AdminArticleController {
	//@Autowired
	private IAArticles metier;
	@RequestMapping(value="/index")
	public String index(Model model)
	{
		model.addAttribute("article", new Article());
		model.addAttribute("Articles", metier.listArticles());
		return "articles";
	}

	public AdminArticleController() {
		// TODO Auto-generated constructor stub
	}

}
