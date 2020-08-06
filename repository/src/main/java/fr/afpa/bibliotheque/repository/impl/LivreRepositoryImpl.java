package fr.afpa.bibliotheque.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import fr.afpa.bibliotheque.data.Livre;
import fr.afpa.bibliotheque.repository.LivreRepository;

@Repository("livreRepository")
public class LivreRepositoryImpl implements LivreRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void setRepoCreateLivre(String titre, String description, String isbn, String code) {
		String query = "insert into Livre (titre, description, isbn, code) values(?,?,?,?)";
		jdbcTemplate.update(query, titre, description, isbn, code);
	}

	@Override
	public void setRepoDeleteLivre(String isbn) {
		jdbcTemplate.update("delete from Livre where idlivre  = ?", isbn);
	}

	@Override
	public List<Livre> getRepoFindLivreByTitle(String titre) {
		String query = "SELECT titre, description, isbn, code FROM Livre WHERE titre LIKE ?";
		return jdbcTemplate.query(query, new Object[] { "%" + titre + "%" }, new LivresMapper());
	}

	private static final class LivresMapper implements RowMapper<Livre> {
		public Livre mapRow(ResultSet rs, int rowNum) throws SQLException {
			Livre msg = new Livre();
			msg.setTitre(rs.getString("titre"));
			return msg;
		}
	}

	@Override
	public String findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
