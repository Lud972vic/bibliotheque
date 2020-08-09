package fr.afpa.bibliotheque.data;

import lombok.Data;

@Data
public class LivreAuteur {
	private int fk_idlivres;
	private int fk_idauteurs;
}
