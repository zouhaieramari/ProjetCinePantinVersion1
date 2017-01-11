package fr.demos.cinepantin.dao;
import java.util.List;

import fr.demos.cinepantin.entities.Client;


public interface ClientDao {
	
	// specification 
			void insert(Client c)  throws Exception;
			void update(Client c)  throws Exception;
			void delete(Long idClient)  throws Exception;
			List<Client> select (String critere)  throws Exception;
			List<Client> selecttout ()  throws Exception;

}

