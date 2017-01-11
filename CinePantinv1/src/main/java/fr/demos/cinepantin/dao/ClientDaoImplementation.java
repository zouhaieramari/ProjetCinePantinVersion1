
package fr.demos.cinepantin.dao;

import java.util.List;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.transaction.annotation.Transactional;

import fr.demos.cinepantin.entities.Article;
import fr.demos.cinepantin.entities.Client;
import fr.demos.cinepantin.entities.Livre;

public class ClientDaoImplementation implements ClientDao{
	@PersistenceContext
	private EntityManager em;
	
	public ClientDaoImplementation()  {
		// TODO Auto-generated constructor stub
	}

	@Transactional
	@Override
	public void insert(Client c) throws Exception {
		
		em.persist(c);
	}

	@Transactional
	@Override
	public void update(Client c) throws Exception {
		em.remove(c);
		
	}

	@Transactional
	@Override
	public void delete(Long idClient) throws Exception {
		Client c = em.find(Client.class, idClient);
		em.remove(c);
		
	}

	@Override
	public List<Client> select(String critere) throws Exception {
		String query = "select cli from client cli ";
		TypedQuery<Client> q = em.createQuery(query, Client.class);
		return q.getResultList();
	}

	@Override
	public List<Client> selecttout() throws Exception {
		String query = "select cli from Client cli  ";
		TypedQuery<Client> q = em.createQuery(query, Client.class);
		return q.getResultList();
	}

}
