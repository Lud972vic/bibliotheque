package fr.afpa.bibliotheque.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fr.afpa.bibliotheque.data.Themes;

public class ThemeMapper implements RowMapper<Themes> {

	@Override
	public Themes mapRow(ResultSet arg0, int arg1) throws SQLException {
		Themes themes = new Themes();

		themes.setTheme("theme");

		return null;
	}
}
