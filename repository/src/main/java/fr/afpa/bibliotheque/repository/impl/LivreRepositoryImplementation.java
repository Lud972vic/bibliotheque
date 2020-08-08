package fr.afpa.bibliotheque.repository.impl;

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
	@Autowired
	/*
	 * JdbcTemplate montre certaines méthodes de requête et le résultat de retour
	 * est une liste d'objets Java
	 */
	JdbcTemplate jdbcTemplate;

	@Override
	public void setRepositoryCreateLivre(String titre, String description, String isbn, String code) {
		final String INSERT_SQL = "insert into Livre (titre, description, isbn, code) values(?,?,?,?)";
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
		System.out.println(keyHolder.getKey());
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

	// private static final class LivresMapper implements RowMapper<Livre> {
	// public Livre mapRow(ResultSet rs, int rowNum) throws SQLException {
	// Livre msg = new Livre();
	// msg.setTitre(rs.getString("titre"));
	// return msg;
	// }
	// }

	@Override
	public String findRepositoryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBusinessCreateLivreComplet(String unTitre, String uneDescription, String unIsbn, String unCode,
			String unAuteur, String unNomemplacement, String unTheme) {
		// A finir : La requete INTO pour les 3 tables livre, theme, auteur
		// String query = "insert into Livre (titre, description, isbn, code, auteur,
		// nomemplacement, theme) values(?,?,?,?,?,?,?)";
		// jdbcTemplate.update(query, unTitre, uneDescription, unIsbn, unCode, unAuteur,
		// unNomemplacement, unTheme);
	}
}