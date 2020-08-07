package fr.afpa.bibliotheque.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fr.afpa.bibliotheque.data.Livre;

/* RowMapper définit des mappages entre des colonnes et des champs de classe */
public class LivreMapper implements RowMapper<Livre> {
	/* Le mot-clé @override est utilisé pour définir une méthode qui est héritée de la classe parente. 
	 * On ne l'utilise donc que dans le cas de l'héritage. En plaçant ce mot-clé dans le commentaire 
	 * de la méthode réécrite, le compilateur vérifiera que la méthode est correctement utilisée 
	 * (mêmes arguments, même type de valeur de retour) et affichera un message d'avertissement si 
	 * ce n'est pas le cas.*/
	
	@Override
	public Livre mapRow(ResultSet rs, int rowNum) throws SQLException {
		Livre livre = new Livre();
		
		livre.setTitre(rs.getString("titre"));
		livre.setDescription(rs.getString("description"));
		livre.setIsbn(rs.getString("isbn"));
		livre.setCode(rs.getString("code"));
		
		return livre;
	}
}
