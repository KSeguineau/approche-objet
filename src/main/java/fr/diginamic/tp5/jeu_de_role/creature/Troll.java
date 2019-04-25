package fr.diginamic.tp5.jeu_de_role.creature;

import static fr.diginamic.tp5.jeu_de_role.utils.Randomutils.getRand;

import fr.diginamic.tp5.jeu_de_role.Creature;

public class Troll extends Creature {

	public Troll() {
		super(getRand(12, 20), getRand(20, 30), 5);
		this.type = "troll";
	}

}
