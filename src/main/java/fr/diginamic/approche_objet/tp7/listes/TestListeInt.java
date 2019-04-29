package fr.diginamic.approche_objet.tp7.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

		list.forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println("la plus grande valeur est " + plusGrandElement(list));
		supprimerPlusPetit(list);
		rendreElemPositif(list);
		System.out.println(list);

	}

	public static Integer plusGrandElement(List<Integer> list) {
		Integer max = Integer.MIN_VALUE;
		for (Integer i : list) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	public static void supprimerPlusPetit(List<Integer> list) {
		int indice = -1;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
				indice = i;
			}
		}
		list.remove(indice);
	}

	public static void rendreElemPositif(List<Integer> list) {
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j) < 0) {
				list.set(j, list.get(j) * -1);
			}
		}
	}

}
