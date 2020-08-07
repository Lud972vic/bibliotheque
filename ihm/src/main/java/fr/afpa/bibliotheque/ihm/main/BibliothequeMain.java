/**
 * 
 */
package fr.afpa.bibliotheque.ihm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.afpa.bibliotheque.business.AuteurBusiness;
import fr.afpa.bibliotheque.business.LivreBusiness;
import fr.afpa.bibliotheque.ihm.config.MainConfig;
import lombok.extern.log4j.Log4j;

/**
 * @author bilonjea
 *
 */
@Log4j
public class BibliothequeMain {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		log.info("--------------------------------------" + "---------------------------------------"
				+ "-------------Bibliothe-----------------" + "---------------------------------------"
				+ "---------------------------------------");

		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

		// TestBusiness test = (TestBusiness) ctx.getBean("testBusiness");
		// test.sayHello();

		// ExempleLivreBusiness livre = (ExempleLivreBusiness)
		// ctx.getBean("exempleLivreBusinessImpl");

		// int nbr = livre.getLibreByCategory("losirs");
		// System.out.println("show livres de la categores loisirs "+ nbr);

		log.info("Le livre est crée...");
		LivreBusiness livreBusiness = (LivreBusiness) ctx.getBean("livreBusinessImpl");
		livreBusiness.setBusinessCreateLivre("Livre", "Desc", "300", "600");

		log.info("Le livre complet est crée...");
		livreBusiness.setBusinessCreateLivreComplet("titre", "description", "isbn", "code", "Jane Austen",
				"nomemplacement", "theme");

		log.info("Recherche un auteur 1 OUI 0 NON");
		AuteurBusiness auteurBusiness = (AuteurBusiness) ctx.getBean("auteurBusinessImpl");
		System.out.println(auteurBusiness.getBusinessAuteurHesite("Jason N. Gaylord"));
	}
}