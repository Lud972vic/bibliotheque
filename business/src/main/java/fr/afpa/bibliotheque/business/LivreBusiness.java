package fr.afpa.bibliotheque.business;

import java.util.List;

import fr.afpa.bibliotheque.data.Livre;

public interface LivreBusiness {
	
	public void setBusinessCreateLivre(String titre, String description, String isbn, String code);

	public void setBusinessDeleteLivre(String isbn);

	public List<Livre> getBusinessRechercherLivreParTitre(String titre);
}
