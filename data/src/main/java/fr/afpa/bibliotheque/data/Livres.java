package fr.afpa.bibliotheque.data;

import lombok.Data;

@Data
public class Livres {
	private int idlivres;
	private String titre;
	private String description;
	private String isbn;
	private String code;
}
