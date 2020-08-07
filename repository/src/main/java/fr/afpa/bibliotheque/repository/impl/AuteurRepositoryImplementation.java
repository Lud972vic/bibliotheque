package fr.afpa.bibliotheque.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import fr.afpa.bibliotheque.data.Auteurs;
import fr.afpa.bibliotheque.repository.AuteurRepositoryInterface;
import fr.afpa.bibliotheque.repository.mapper.AuteurMapper;

@Service
public class AuteurRepositoryImplementation implements AuteurRepositoryInterface {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Auteurs getRepositoryAuteurHesite(String auteur) {
		String query = "Select Count(*) FROM auteur WHERE auteur = ?";
		return jdbcTemplate.queryForObject(query, new Object[] { auteur }, new AuteurMapper());
	}
}
