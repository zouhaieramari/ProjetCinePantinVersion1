package fr.demos.cinepantin.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.UserTransaction;

import org.springframework.transaction.annotation.Transactional;

import fr.demos.cinepantin.entities.Article;


public class ArticleDaoImplementation implements ArticleDao {

	@PersistenceContext
	private EntityManager em;
	//@Resource
	//private UserTransaction ut;

	public ArticleDaoImplementation() {
		// TODO Auto-generated constructor stub
	}

	@Transactional
	@Override
	public void insert(Article l) throws Exception {
		
		//ut.begin();
		// persist = insertion
		em.persist(l);
		//ut.commit();

	}

	@Transactional
	@Override
	public void update(Article l) throws Exception {
		
		//ut.begin();
		em.remove(l);
		//ut.commit();

	}

	@Transactional
	@Override
	public void delete(Long idArticle) throws Exception {
		
		//ut.begin();
		Article a = em.find(Article.class, idArticle);
		em.remove(a);
		//ut.commit();

	}

	@Transactional
	@Override
	public Article findById(Long idArticle) throws Exception {
		Article a = em.find(Article.class, idArticle);
		return a;

	}

	@Override
	public List<Article> select(String critere) throws Exception {
		String query = "select art from article art ";
		TypedQuery<Article> q = em.createQuery(query, Article.class);
		return q.getResultList();
	}

}
