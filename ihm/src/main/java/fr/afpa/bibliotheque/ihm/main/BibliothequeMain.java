/**
 * 
 */
package fr.afpa.bibliotheque.ihm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.afpa.bibliotheque.business.ExempleLivreBusiness;
import fr.afpa.bibliotheque.business.LivreBusiness;
import fr.afpa.bibliotheque.business.TestBusiness;
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
		log.info("--------------------------------------"
				+"---------------------------------------"
				+"-------------Bibliothe-----------------"
				+"---------------------------------------"
				+"---------------------------------------");
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
	
		TestBusiness test = (TestBusiness) ctx.getBean("testBusiness");
		test.sayHello();
		
		ExempleLivreBusiness livre =  (ExempleLivreBusiness) ctx.getBean("exempleLivreBusinessImpl");
		
		int nbr = livre.getLibreByCategory("losirs");
		System.out.println("show livres de la categores loisirs "+ nbr);
		
		LivreBusiness livreB = (LivreBusiness) ctx.getBean("livreBusinessImpl");
		livreB.setBusinessCreateLivre("test", "afffff", "114", "44");
		log.info("Le livre est crée...");
		
		livreB.setBusinessCreateLivreComplet("titre", "description", "isbn", "code", "auteur", "nomemplacement", "theme");
		log.info("Le livre complet est crée...");
	}
}