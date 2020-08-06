package fr.afpa.bibliotheque.data;

import lombok.Data;

@Data
public class Emplalivrdispo {
	private int idemplaLivrDispo;
	private int disponibilite;
	private int fk_idemplacement;
	private int fk_idlivres;
}
