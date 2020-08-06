package fr.afpa.bibliotheque.business.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import fr.afpa.bibliotheque.business.LivreBusiness;
import fr.afpa.bibliotheque.data.Livre;
import fr.afpa.bibliotheque.service.LivreService;

@Component
public class LivreBusinessImpl implements LivreBusiness {
	@Autowired
	LivreService livreService;

	@Override
	public void setBusinessCreateLivre(String titre, String description, String isbn, String code) {
		livreService.setServiceCreateLivre(titre, description, isbn, code);
	}

	@Override
	public void setBusinessDeleteLivre(String isbn) {
		livreService.setServiceDeleteLivre(isbn);
	}

	@Override
	public List<Livre> getBusinessRechercherLivreParTitre(String titre) {
		return livreService.getServiceRechercherLivreParTitre(titre);
	}	
}
