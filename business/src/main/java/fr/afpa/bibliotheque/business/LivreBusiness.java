package fr.afpa.bibliotheque.business;

import java.util.List;

import fr.afpa.bibliotheque.data.Livre;

public interface LivreBusiness {

	/* Créer une méthode pour créer un livre avec l'auteur, le theme et
	 * l'emplacement
	 */
	public void setBusinessCreateLivre(String titre, String description, String isbn, String code);

	public void setBusinessDeleteLivre(String isbn);

	public List<Livre> getBusinessRechercherLivreParTitre(String titre);

	public void setBusinessCreateLivreComplet(String titre, String description, String isbn, String code, String auteur,
			String nomemplacement, String theme);
}
