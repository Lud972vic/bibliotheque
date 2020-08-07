package fr.afpa.bibliotheque.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.bibliotheque.repository.ThemeRepositoryInterface;
import fr.afpa.bibliotheque.service.ThemeServiceInterface;

@Service
public class ThemeServiceImplementation implements ThemeServiceInterface {
	@Autowired
	ThemeRepositoryInterface monThemeRepositoryInterface;

	@Override
	public int getServiceThemeHesite(String theme) {
		return monThemeRepositoryInterface.getRepositoryThemeHesite(theme);
	}
}
