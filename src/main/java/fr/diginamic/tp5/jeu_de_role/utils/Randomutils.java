package fr.diginamic.tp5.jeu_de_role.utils;

import java.util.Random;

public final class Randomutils {

	public static int getRand(int min, int max) {
		Random gen = new Random();
		return gen.nextInt(max + 1 - min) + min;
	}

}
