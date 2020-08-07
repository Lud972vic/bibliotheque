package fr.afpa.bibliotheque.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import fr.afpa.bibliotheque.repository.AuteurRepositoryInterface;

@Service
public class AuteurRepositoryImplementation implements AuteurRepositoryInterface {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public String getRepositoryAuteurHesite(String auteur) {
		String query = "Select Count(*) FROM auteur WHERE auteur = ?";

		return jdbcTemplate.queryForObject(query, new Object[] { auteur }, String.class);
	}
}
