package fr.afpa.bibliotheque.repository;

import java.util.List;
import fr.afpa.bibliotheque.data.Livre;

public interface LivreRepository {
	void createLivre(String titre, String description, String isbn, String code);

	void deleteLivre(String isbn);

	List<Livre> findLivreByTitle(String titre);

	String findAll();
}
