package fr.afpa.bibliotheque.service;

import java.util.List;

import fr.afpa.bibliotheque.data.Livre;

public interface LivreService {

	public void setServiceCreateLivre(String titre, String description, String isbn, String code);

	public void setServiceDeleteLivre(String isbn);

	public List<Livre> getServiceRechercherLivreParTitre(String titre);
}
