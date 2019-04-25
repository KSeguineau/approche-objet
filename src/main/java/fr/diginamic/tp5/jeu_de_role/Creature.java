package fr.diginamic.tp5.jeu_de_role;

import java.util.Arrays;
import java.util.List;

public abstract class Creature extends Entite {

	protected String type;
	public static final String NOM_PACKAGE = "fr.diginamic.tp5.jeu_de_role.creature";
	public static List<String> classeCreature = Arrays.asList("Gobelin", "Loup", "Troll");

	public Creature(int force, int pv, int score) {
		super(force, pv, score);

	}

	@Override
	public String toString() {
		return type;
	}

}
