package fr.afpa.bibliotheque.data;

import java.sql.Date;
import lombok.Data;

@Data
public class Utilisateurs {
	private int idutilisateurs;
	private String nom;
	private String prenom;
	private Date datenaissance;
	private String role;
	private String pseudo;
	private String motdepasse;
}
