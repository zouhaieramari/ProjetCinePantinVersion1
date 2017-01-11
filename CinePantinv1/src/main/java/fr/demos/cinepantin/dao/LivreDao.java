package fr.demos.cinepantin.dao;

import java.util.List;


import fr.demos.cinepantin.entities.Livre;

public interface LivreDao {
	
	// specification les differents methodes pour manupiler  un livre  
			void insert(Livre l)  throws Exception;
			void update(Livre l)  throws Exception;
			void delete(Long idLivre)  throws Exception;
			Livre findById(Long idLivre)  throws Exception;
			List<Livre> select (String critere)  throws Exception;
			List<Livre> selecttout ()  throws Exception;
			List<Livre> selectventeflash ()  throws Exception;
			List<Livre> selectAcceuil(int nbrPage, int pageSize) throws Exception;
}
