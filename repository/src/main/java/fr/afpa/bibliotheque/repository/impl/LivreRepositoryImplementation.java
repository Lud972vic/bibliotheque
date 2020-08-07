package fr.afpa.bibliotheque.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import fr.afpa.bibliotheque.data.Livre;
import fr.afpa.bibliotheque.repository.LivreRepositoryInterface;
import fr.afpa.bibliotheque.repository.mapper.LivreMapper;

@Repository("livreRepositoryInterface")
public class LivreRepositoryImplementation implements LivreRepositoryInterface {
	@Autowired
	/* JdbcTemplate montre certaines méthodes de requête et le résultat de retour est une liste d'objets Java */
	JdbcTemplate jdbcTemplate;

	@Override
	public void setRepositoryCreateLivre(String titre, String description, String isbn, String code) {
		String query = "insert into Livre (titre, description, isbn, code) values(?,?,?,?)";
		jdbcTemplate.update(query, titre, description, isbn, code);
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

//	private static final class LivresMapper implements RowMapper<Livre> {
//		public Livre mapRow(ResultSet rs, int rowNum) throws SQLException {
//			Livre msg = new Livre();
//			msg.setTitre(rs.getString("titre"));
//			return msg;
//		}
//	}

	@Override
	public String findRepositoryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBusinessCreateLivreComplet(String titre, String description, String isbn, String code, String auteur,
			String nomemplacement, String theme) {
		// TODO Auto-generated method stub
	}
}
