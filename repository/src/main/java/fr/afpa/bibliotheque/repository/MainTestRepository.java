package fr.afpa.bibliotheque.repository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.afpa.bibliotheque.repository.config.RepositoryConfig;

public class MainTestRepository {

	public static void main(String[] args) {
		/* Chargment des beans à travers le repository RepositoryConfig */
		ApplicationContext ctx = new AnnotationConfigApplicationContext(RepositoryConfig.class);

		LivreRepositoryInterface testLivre = (LivreRepositoryInterface) ctx.getBean("livreRepositoryInterface");

		/* Ajout d'un livre */
		testLivre.setRepositoryCreateLivre("Notre Livre AFPA", "Formation", "100", "200");
		
		/* Suppresion d'un livre par ISBN */
		testLivre.setRepositoryDeleteLivre("100");

		/* Liste des livres */
		System.out.println(testLivre.getRepositoryFindLivreByTitle("Neuf histoires"));
	}
}
