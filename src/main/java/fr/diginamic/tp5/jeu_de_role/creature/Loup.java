package fr.diginamic.tp5.jeu_de_role.creature;

import static fr.diginamic.tp5.jeu_de_role.utils.Randomutils.getRand;

import fr.diginamic.tp5.jeu_de_role.Creature;

public class Loup extends Creature {

	public Loup() {
		super(getRand(5, 10), getRand(5, 10), 1);
		this.type = "loup";
	}

}
