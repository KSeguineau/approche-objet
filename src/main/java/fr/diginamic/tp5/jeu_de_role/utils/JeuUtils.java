package fr.diginamic.tp5.jeu_de_role.utils;

import static fr.diginamic.tp5.jeu_de_role.utils.Randomutils.getRand;

import java.lang.reflect.Constructor;

import fr.diginamic.tp5.jeu_de_role.Creature;
import fr.diginamic.tp5.jeu_de_role.Personnage;

public final class JeuUtils {

	private JeuUtils() {

	}

	private static void resultatAttaque(Personnage p, Creature c) {
		int result = p.attaque() - c.attaque();
		if (result > 0) {
			c.setPv(c.getPv() - result);
		} else {
			p.setPv(p.getPv() + result);
		}

	}

	private static Creature getCreature() {
		try {
			Class<?> classe = Class.forName(Creature.NOM_PACKAGE + "."
					+ Creature.classeCreature.get(getRand(0, Creature.classeCreature.size() - 1)));
			Constructor<?> constructor = classe.getConstructor();
			return (Creature) constructor.newInstance();

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	public static boolean combat(Personnage p) {
		Creature c = getCreature();
		System.out.println("un " + c.toString() + " vous fait face");

		while (p.getPv() > 0 && c.getPv() > 0) {
			System.out.println("Début du tour");
			JeuUtils.resultatAttaque(p, c);
			System.out
					.println("il reste " + p.getPv() + " au personnage et " + c.getPv() + " au " + c.toString() + "\n");

			try {
				Thread.sleep(2000l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (p.getPv() > 0) {
			p.setScore(p.getScore() + c.getScore());
			return true;
		} else {
			return false;
		}

	}

}
