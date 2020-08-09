package fr.afpa.bibliotheque.repository.impl;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import fr.afpa.bibliotheque.data.Livre;
import fr.afpa.bibliotheque.repository.LivreRepositoryInterface;
import fr.afpa.bibliotheque.repository.mapper.LivreMapper;

@Repository("livreRepositoryInterface")
public class LivreRepositoryImplementation implements LivreRepositoryInterface {
	private BigInteger key;

	@Autowired
	/*
	 * JdbcTemplate montre certaines méthodes de requête et le résultat de retour
	 * est une liste d'objets Java
	 */
	JdbcTemplate jdbcTemplate;

	@Override
	public void setRepositoryCreateLivre(String titre, String description, String isbn, String code) {
		final String INSERT_SQL = "Insert Into Livre (titre, description, isbn, code) values(?,?,?,?)";
		final String monTitre = titre;
		final String maDescription = description;
		final String monIsbn = isbn;
		final String monCode = code;

		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(INSERT_SQL, new String[] { "idlivre" });
				ps.setString(1, monTitre);
				ps.setString(2, maDescription);
				ps.setString(3, monIsbn);
				ps.setString(4, monCode);
				return ps;
			}
		}, keyHolder);

		// keyHolder.getKey() now contains the generated key
		this.key = (BigInteger) keyHolder.getKey();
	}

	@Override
	public BigInteger getIdCreateLivre() {
		return key;
	}

	@Override
	public void setRepositoryDeleteLivre(String isbn) {
		jdbcTemplate.update("delete from Livre where idlivre  = ?", isbn);
	}

	@Override
	public List<Livre> getRepositoryFindLivreByTitle(String titre) {
		String query = "SELECT titre, description, isbn, code FROM Livre WHERE titre LIKE ?";
		return jdbcTemplate.query(query, new Object[] { "%" + titre + "%" }, new LivreMapper());
	}

	@Override
	public String findRepositoryAll() {
		return null;
	}

	@Override
	public void setBusinessCreateLivreComplet(String unTitre, String uneDescription, String unIsbn, String unCode,
			String unAuteur, String unNomemplacement, String unTheme) {	
	}
}