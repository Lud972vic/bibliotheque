package fr.afpa.bibliotheque.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fr.afpa.bibliotheque.data.Auteurs;

public class AuteurMapper implements RowMapper<Auteurs> {

	@Override
	public Auteurs mapRow(ResultSet arg0, int arg1) throws SQLException {
		Auteurs auteur = new Auteurs();

		auteur.setAuteur("auteur");

		return auteur;
	}
}
