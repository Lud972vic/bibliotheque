package fr.afpa.bibliotheque.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Service;

import fr.afpa.bibliotheque.repository.LivreAuteurRepositoryInterface;

@Service
public class LivreAuteurRepositoryImplementation implements LivreAuteurRepositoryInterface {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void setRepositoryLivreAuteur(int idLivre, int idAuteur) {
		final String query = "Insert Into Livre_Auteur (fk_idlivre, fk_idauteur)  Values (?,?)";
		final int monIdLivre = idLivre;
		final int monIdAuteur = idAuteur;

		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(query, new String[] {});
				ps.setInt(1, monIdLivre);
				ps.setInt(2, monIdAuteur);
				return ps;
			}
		});
	}
}
