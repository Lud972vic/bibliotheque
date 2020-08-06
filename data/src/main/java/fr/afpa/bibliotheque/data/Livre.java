package fr.afpa.bibliotheque.data;

import lombok.Data;

@Data
public class Livre {
	private int idlivres;
	private String titre;
	private String description;
	private String isbn;
	private String code;
}
