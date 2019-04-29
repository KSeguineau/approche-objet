package fr.diginamic.approche_objet.tp7.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestVille {

	public static Ville plusPeuplee(List<Ville> list) {
		Ville tmp = list.get(0);

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).getNbHabitants() > tmp.getNbHabitants()) {
				tmp = list.get(i);
			}
		}
		return tmp;
	}

	public static void supprimerMoinsPeuplee(List<Ville> list) {
		Ville tmp = list.get(0);
		int indice = 0;

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).getNbHabitants() < tmp.getNbHabitants()) {
				tmp = list.get(i);
				indice = i;
			}
		}
		list.remove(indice);
	}

	public static void plusCentMille(List<Ville> list) {
		for (int i = 0; i < list.size(); i++) {
			Ville ville = list.get(i);
			if (ville.getNbHabitants() > 100000) {
				ville.setNom(ville.getNom().toUpperCase());
			}
		}
	}

	public static void main(String[] args) {

		List<Ville> list = new ArrayList<>();
		list.addAll(Arrays.asList(new Ville("Nice", 343000), new Ville("Carcassonne", 47800),
				new Ville("Narbonne", 53400), new Ville("Lyon", 484000), new Ville("Foix", 9700),
				new Ville("Pau", 77200), new Ville("Marseille", 850700), new Ville("Tarbes", 40600)));

		System.out.println(list);
		System.out.println(plusPeuplee(list));
		supprimerMoinsPeuplee(list);
		System.out.println(list);
		plusCentMille(list);
		System.out.println(list);

	}

}
