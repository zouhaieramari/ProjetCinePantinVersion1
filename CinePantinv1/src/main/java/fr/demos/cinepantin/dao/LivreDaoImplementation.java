package fr.demos.cinepantin.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.transaction.annotation.Transactional;
import fr.demos.cinepantin.entities.Article;
import fr.demos.cinepantin.entities.Livre;
public class LivreDaoImplementation implements LivreDao{

	@PersistenceContext
	private EntityManager em;
	//@Resource
	//private UserTransaction ut;

	public LivreDaoImplementation() {
		// TODO Auto-generated constructor stub
	}

	@Transactional
	@Override
	public void insert(Livre l) throws Exception {
		
		//ut.begin();
		// persist = insertion
		em.persist(l);
		//ut.commit();

	}

	@Transactional
	@Override
	public void update(Livre l) throws Exception {
		
		//ut.begin();
		em.remove(l);
		//ut.commit();

	}

	@Transactional
	@Override
	public void delete(Long idLivre) throws Exception {
		
		//ut.begin();
		Article a = em.find(Article.class, idLivre);
		em.remove(a);
		//ut.commit();

	}
	@Override
	public Livre findById(Long idLivre) throws Exception {
		Livre livre = em.find(Livre.class, idLivre);
		return livre;
	}

	
	@Override
	public List<Livre> select(String critere) throws Exception {
		String query = "select liv from livre liv ";
		TypedQuery<Livre> q = em.createQuery(query, Livre.class);
		return q.getResultList();
	}

	
	@Override
	public List<Livre> selecttout() throws Exception {
		//Query req = em.createQuery("select liv from livre liv");
		//return req.getResultList();
		String query = "select liv from Livre liv  ";
		TypedQuery<Livre> q = em.createQuery(query, Livre.class);
		return q.getResultList();
	}

	@Override
	public List<Livre> selectventeflash() throws Exception {
		String query = "select liv from Livre liv WHERE liv.prixHT <=10"; 
		//select liv.ISBN from Livre as liv
		TypedQuery<Livre> q = em.createQuery(query, Livre.class);
		return q.getResultList();
	}

	@Override
	public List<Livre> selectAcceuil(int nbrPage, int pageSize) throws Exception {
		String query = "select liv from Livre liv WHERE liv.prixHT <=10000"; 
		//select liv.ISBN from Livre as liv
		TypedQuery<Livre> q = em.createQuery(query, Livre.class);
		q.setFirstResult((nbrPage-1)*pageSize);
		q.setMaxResults(pageSize);
		return q.getResultList();
	}
	//select liv.nomPhoto from Livre as liv where liv.prixHT < 10

}
