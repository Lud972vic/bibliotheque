package fr.afpa.bibliotheque.data;

import lombok.Data;

@Data
public class Livre_auteur {
	private int idlivre_auteur;
	private int fk_idlivres;
	private int fk_idauteurs;
}
