package fr.afpa.bibliotheque.repository;

import java.util.List;
import fr.afpa.bibliotheque.data.Livre;

public interface LivreRepository {
	void setRepoCreateLivre(String titre, String description, String isbn, String code);

	void setRepoDeleteLivre(String isbn);

	List<Livre> getRepoFindLivreByTitle(String titre);

	String findAll();
}
