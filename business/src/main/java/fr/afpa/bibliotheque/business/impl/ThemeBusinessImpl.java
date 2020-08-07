package fr.afpa.bibliotheque.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afpa.bibliotheque.business.ThemeBusiness;
import fr.afpa.bibliotheque.service.ThemeServiceInterface;

@Component
public class ThemeBusinessImpl implements ThemeBusiness {
	@Autowired
	ThemeServiceInterface themeServiceInterface;

	@Override
	public int getBusinessThemeHesite(String theme) {
		return themeServiceInterface.getServiceThemeHesite(theme);
	}
}
