package fr.afpa.bibliotheque.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import fr.afpa.bibliotheque.data.Livres;

public class LivreMapper implements RowMapper<Livres> {
	@Override
	public Livres mapRow(ResultSet rs, int rowNum) throws SQLException {
		Livres livre = new Livres();
		
		livre.setTitre(rs.getString("titre"));
		livre.setDescription(rs.getString("description"));
		livre.setIsbn(rs.getString("isbn"));
		livre.setCode(rs.getString("code"));
		
		return livre;
	}
}
