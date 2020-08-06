package fr.afpa.bibliotheque.repository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.afpa.bibliotheque.repository.config.RepositoryConfig;



public class MainTestRepository {

	public static void main(String[] args) {
		/**/
		ApplicationContext ctx = new AnnotationConfigApplicationContext(RepositoryConfig.class);
		/*changement des beans à tranvers le repository RepositoryConfig.class du package du test*/
		/*le type de la variable LivreRepository est classe */
		LivreRepository testLivre = (LivreRepository) ctx.getBean("livreRepository");
		testLivre.createLivre("Notre Livre AFPA", "Formation", "100", "200");
		
	}

}
