package fr.afpa.bibliotheque.repository;

import java.math.BigInteger;
import java.util.List;

import fr.afpa.bibliotheque.data.Livre;

/* Le repository est une interface à écrire par le développeur.
 * Il déclare, dans cette interface, les méthodes utiles d'accès aux données...
 */

public interface LivreRepositoryInterface {
	/* Creation d'un livre */
	void setRepositoryCreateLivre(String titre, String description, String isbn, String code);

	/*
	 * Creation du livre, et affectation de l'auteur, du theme et de l'emplacement
	 */
	void setBusinessCreateLivreComplet(String titre, String description, String isbn, String code, String auteur,
			String nomemplacement, String theme);

	/* Recuperation de l'id du livre */
	BigInteger getIdCreateLivre();

	/* Suppresion du livre */
	void setRepositoryDeleteLivre(String isbn);

	/* Retourne des livres */
	List<Livre> getRepositoryFindLivreByTitle(String titre);

	/* Retourne tous les livres --TODO */
	String findRepositoryAll();
}
