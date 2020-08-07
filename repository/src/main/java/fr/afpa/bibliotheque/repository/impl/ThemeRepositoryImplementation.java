package fr.afpa.bibliotheque.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import fr.afpa.bibliotheque.repository.ThemeRepositoryInterface;
@Service
public class ThemeRepositoryImplementation implements ThemeRepositoryInterface {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int getRepositoryThemeHesite(String theme) {
		String query = "Select Count(*) FROM theme WHERE theme = ?";

		return jdbcTemplate.queryForObject(query, new Object[] { theme }, Integer.class);
	}
}
