package fr.diginamic.tp5.jeu_de_role.utils;

import junit.framework.TestCase;

public class RandomutilsTest extends TestCase {

	public void testGetRand() {
		for (int i = 0; i < 10; i++) {
			int resultat = Randomutils.getRand(0, 2);
			System.out.println(resultat);
		}
	}

}
