package fr.afpa.bibliotheque.data;

import java.sql.Date;

import lombok.Data;

@Data
public class Emprunts {
	private int idemprunt;
	private Date dateemprunt;
	private int fk_idutilisateur;
	private int fk_idlivres;
}
