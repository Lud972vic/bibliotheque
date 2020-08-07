package fr.afpa.bibliotheque.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.bibliotheque.data.Auteurs;
import fr.afpa.bibliotheque.repository.AuteurRepositoryInterface;
import fr.afpa.bibliotheque.service.AuteurServiceInterface;

@Service
public class AuteurServiceImplementation implements AuteurServiceInterface {
	@Autowired
	AuteurRepositoryInterface monAuteurRepositoryInterface;

	@Override
	public Auteurs getServiceAuteurHesite(String auteur) {
		return monAuteurRepositoryInterface.getRepositoryAuteurHesite(auteur);
	}
}
