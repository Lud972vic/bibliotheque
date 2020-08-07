package fr.afpa.bibliotheque.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afpa.bibliotheque.business.AuteurBusiness;
import fr.afpa.bibliotheque.data.Auteurs;
import fr.afpa.bibliotheque.service.AuteurServiceInterface;

@Component
public class AuteurBusinessImpl implements AuteurBusiness {
	@Autowired
	AuteurServiceInterface auteurServiceInterface;

	@Override
	public String getBusinessAuteurHesite(String auteur) {
		return auteurServiceInterface.getServiceAuteurHesite(auteur);
	}
}
