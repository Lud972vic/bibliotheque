package fr.afpa.bibliotheque.repository;

import java.util.List;
import fr.afpa.bibliotheque.data.Livres;

public interface LivreRepository {
	void createLivre(String titre, String description, String isbn, String code);

	void deleteLivre(String isbn);

	List<Livres> findLivreByTitle(String titre);

	String findAll();
}
