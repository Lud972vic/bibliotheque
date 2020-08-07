package fr.afpa.bibliotheque.service;

import java.util.List;

import fr.afpa.bibliotheque.data.Livre;

/* Déclaration d'un service
 * La première étape consiste à déclarer le service,
 * ce qui revient tout simplement à écrire l'interface 
 * ou la classe abstraite qui sera utilisée par l'application.
 */
public interface LivreServiceInterface {
	public void setServiceCreateLivre(String titre, String description, String isbn, String code);
	public void setServiceDeleteLivre(String isbn);
	public List<Livre> getServiceRechercherLivreParTitre(String titre);
	public String getAuteurHesite(String auteur);
}
