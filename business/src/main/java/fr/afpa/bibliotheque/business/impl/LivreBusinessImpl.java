package fr.afpa.bibliotheque.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afpa.bibliotheque.business.LivreBusiness;
import fr.afpa.bibliotheque.data.Livre;
import fr.afpa.bibliotheque.service.LivreServiceInterface;

@Component
public class LivreBusinessImpl implements LivreBusiness {
	@Autowired
	LivreServiceInterface livreServiceInterface;
	/* Ajouter les services Emplacemement, Auteur et Theme
	 * AuteurServiceInterface auteurService;
	 * ThemeServiceInterface themeService;
	 * EmplacementServiceInterface emplacementService;
	 */

	@Override
	public void setBusinessCreateLivre(String titre, String description, String isbn, String code) {
		livreServiceInterface.setServiceCreateLivre(titre, description, isbn, code);
	}

	@Override
	public void setBusinessDeleteLivre(String isbn) {
		livreServiceInterface.setServiceDeleteLivre(isbn);
	}

	@Override
	public List<Livre> getBusinessRechercherLivreParTitre(String titre) {
		return livreServiceInterface.getServiceRechercherLivreParTitre(titre);
	}

	@Override
	public void setBusinessCreateLivreComplet(String titre, String description, String isbn, String code, String auteur,
			String nomemplacement, String theme) {
	}
}
