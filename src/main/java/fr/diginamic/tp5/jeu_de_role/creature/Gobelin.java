package fr.diginamic.tp5.jeu_de_role.creature;

import static fr.diginamic.tp5.jeu_de_role.utils.Randomutils.getRand;

import fr.diginamic.tp5.jeu_de_role.Creature;

public class Gobelin extends Creature {

	public Gobelin() {
		super(getRand(7, 12), getRand(10, 15), 2);
		this.type = "gobelin";
	}

}
