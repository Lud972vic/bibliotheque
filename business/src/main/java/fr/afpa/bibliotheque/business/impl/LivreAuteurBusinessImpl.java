package fr.afpa.bibliotheque.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afpa.bibliotheque.business.LivreAuteurBusiness;
import fr.afpa.bibliotheque.service.LivreAuteurServiceInterface;

@Component
public class LivreAuteurBusinessImpl implements LivreAuteurBusiness {
	@Autowired
	LivreAuteurServiceInterface livreAuteurServiceInterface;

	@Override
	public void setBusinessLivreAuteur(int idLivre, int idAuteur) {
		livreAuteurServiceInterface.setServiceLivreAuteur(idLivre, idAuteur);
	}
}
