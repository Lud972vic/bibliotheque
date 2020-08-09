package fr.afpa.bibliotheque.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.bibliotheque.repository.LivreAuteurRepositoryInterface;
import fr.afpa.bibliotheque.service.LivreAuteurServiceInterface;

@Service
public class LivreAuteurServiceImplementation implements LivreAuteurServiceInterface {
	@Autowired
	LivreAuteurRepositoryInterface monLivreAuteurRepositoryInterface;

	@Override
	public void setServiceLivreAuteur(int idLivre, int idAuteur) {
		monLivreAuteurRepositoryInterface.setRepositoryLivreAuteur(idLivre, idAuteur);
	}
}
