package fr.diginamic.approche_objet.tp7.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static String plusGrandNom(List<String> list) {
		String plusLong = "";

		for (String s : list) {
			if (plusLong.length() < s.length()) {
				plusLong = s;
			}
		}
		return plusLong;
	}

	public static void majuscule(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i).toUpperCase());
		}

	}

	public static void supprimerParPremiereLettre(char c, List<String> list) {
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String tmp = it.next();
			if (tmp.charAt(0) == c) {
				it.remove();
			}
		}
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

		System.out.println(plusGrandNom(list));
		majuscule(list);
		System.out.println(list);
		supprimerParPremiereLettre('N', list);
		System.out.println(list);

	}

}
