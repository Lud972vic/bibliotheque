package fr.afpa.bibliotheque.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fr.afpa.bibliotheque.data.LivreAuteur;

public class LivreAuteurMapper implements RowMapper<LivreAuteur> {

	@Override
	public LivreAuteur mapRow(ResultSet arg0, int arg1) throws SQLException {
		LivreAuteur livreAuteur = new LivreAuteur();
		
		int b = 0;
		int a = 0;
		
		livreAuteur.setFk_idauteurs(a);
		livreAuteur.setFk_idauteurs(b);

		return livreAuteur;
	}
}
