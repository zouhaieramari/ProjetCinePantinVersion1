package fr.demos.cinepantin.dao;

import java.util.List;

import fr.demos.cinepantin.entities.Article;


public interface ArticleDao {
	// specification 
		void insert(Article l)  throws Exception;
		void update(Article l)  throws Exception;
		void delete(Long idArticle)  throws Exception;
		public Article findById(Long idArticle) throws Exception;
		List<Article> select (String critere)  throws Exception;

}
