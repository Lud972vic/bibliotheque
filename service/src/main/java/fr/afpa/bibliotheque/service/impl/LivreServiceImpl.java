package fr.afpa.bibliotheque.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.afpa.bibliotheque.data.Livre;
import fr.afpa.bibliotheque.repository.LivreRepository;
import fr.afpa.bibliotheque.service.LivreService;

@Service
public class LivreServiceImpl implements LivreService {
	@Autowired
	LivreRepository livreRepository;

	@Override
	public void setServiceCreateLivre(String titre, String description, String isbn, String code) {
		livreRepository.setRepoCreateLivre(titre, description, isbn, code);
	}

	@Override
	public void setServiceDeleteLivre(String isbn) {
		livreRepository.setRepoDeleteLivre(isbn);
	}

	@Override
	public List<Livre> getServiceRechercherLivreParTitre(String titre) {
		return livreRepository.getRepoFindLivreByTitle(titre);
	}

}
