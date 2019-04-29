package fr.diginamic.tp8.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetDouble {

	public static Double plusGrand(Set<Double> hashset) {
		Iterator<Double> it = hashset.iterator();
		Double max = Double.MIN_VALUE;

		while (it.hasNext()) {
			Double tmp = it.next();
			if (tmp > max) {
				max = tmp;
			}
		}
		return max;

	}

	public static void main(String[] args) {

		Set<Double> hashset = new HashSet<>();
		hashset.addAll(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01, 13.3));

		System.out.println(hashset);// il ne sont pas dans l'ordre car les
									// éléments ne sont pas indexés.
		System.out.println("le plus grand nombre: " + plusGrand(hashset));
	}

}
