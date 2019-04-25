package fr.diginamic.tp5.jeu_de_role;

import static fr.diginamic.tp5.jeu_de_role.utils.Randomutils.getRand;

public class Personnage extends Entite {

	public Personnage() {
		super(getRand(12, 18), getRand(20, 50), 0);
	}

}
