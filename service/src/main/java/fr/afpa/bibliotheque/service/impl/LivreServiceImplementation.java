/*
* L'utilisation des services permet d'apporter une modularité et un meilleur découplage à votre application. 
* En effet, l'application utilisera les services au travers d'interfaces ce qui permet 
* de s'abstraire de leur implémentation.
* Imaginons une application nécessitant une authentification de la part de l'utilisateur. 
* Du point de vue de l'application (couche présentation), 
* la seule chose importante est de savoir si un couple login/password est valide, peu importe 
* comment est effectué cette validation (couche business).
* L'application ne s'intéresse pas à l'implémentation du mécanisme d'authentification qui doit lui rester "invisible". 
* Ainsi même si ce mécanisme d'authentification change cela n'impactera pas le code de l'application.
*/

package fr.afpa.bibliotheque.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.bibliotheque.data.Livre;
import fr.afpa.bibliotheque.repository.LivreRepositoryInterface;
import fr.afpa.bibliotheque.service.LivreServiceInterface;

/* Implémentation du service */
@Service
public class LivreServiceImplementation implements LivreServiceInterface {
	@Autowired
	/* @Autowired c’est une annotation qui nous permet de faire l’injection de dépendances entre les beans 
	 * de l’application (Spring va tout faire), il suffit juste d’annoter un constructeur ou 
	 * une méthode avec cette dernière. et le conteneur Spring va faire la suite
	 * (La creation du bean, le chercher et l’injecter automatiquement…).
	 */
	
	LivreRepositoryInterface monLivreRepository;

	@Override
	public void setServiceCreateLivre(String titre, String description, String isbn, String code) {
		monLivreRepository.setRepositoryCreateLivre(titre, description, isbn, code);
	}

	@Override
	public void setServiceDeleteLivre(String isbn) {
		monLivreRepository.setRepositoryDeleteLivre(isbn);
	}

	@Override
	public List<Livre> getServiceRechercherLivreParTitre(String titre) {
		return monLivreRepository.getRepositoryFindLivreByTitle(titre);
	}

	@Override
	public String getAuteurHesite(String auteur) {
		return monLivreRepository.getAuteurHesite(auteur);
	}

}