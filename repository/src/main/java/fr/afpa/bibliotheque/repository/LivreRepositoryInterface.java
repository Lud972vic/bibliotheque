package fr.afpa.bibliotheque.repository;

import java.util.List;

import fr.afpa.bibliotheque.data.Livre;

/* Le repository est une interface à écrire par le développeur.
 * Il déclare, dans cette interface, les méthodes utiles d'accès aux données...
 */

public interface LivreRepositoryInterface {
	void setRepositoryCreateLivre(String titre, String description, String isbn, String code);

	void setRepositoryDeleteLivre(String isbn);

	List<Livre> getRepositoryFindLivreByTitle(String titre);

	String findRepositoryAll();

	void setBusinessCreateLivreComplet(String titre, String description, String isbn, String code, String auteur,
			String nomemplacement, String theme);
	
	String getAuteurHesite(String auteur);
}
