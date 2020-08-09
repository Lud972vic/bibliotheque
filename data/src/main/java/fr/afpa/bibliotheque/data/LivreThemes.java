package fr.afpa.bibliotheque.data;

import lombok.Data;

@Data
public class LivreThemes {
	private int idlivre_them;
	private int fk_idthemes;
	private int fk_idlivres;
}
