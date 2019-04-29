package fr.diginamic.tp9.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import fr.diginamic.tp8.sets.ex3.Pays;

public class TestMapPays {

	public static void supprimerMoinsHabitants(Map<String, Pays> map) {
		Iterator<String> itKey = map.keySet().iterator();
		String minHabitants;

		if (itKey.hasNext()) {
			minHabitants = itKey.next();
			while (itKey.hasNext()) {
				String tmp = itKey.next();
				if (((Pays) map.get(tmp)).getNbHabitants() < ((Pays) map.get(minHabitants)).getNbHabitants()) {
					minHabitants = tmp;
				}
			}
			map.remove(minHabitants);
		}
	}

	public static void main(String[] args) {

		Pays usa = new Pays("USA", 327167434, 55805);
		Pays france = new Pays("France", 67795000, 38476);
		Pays allemagne = new Pays("Allemagne", 82979100, 47589);
		Pays uk = new Pays("UK", 65105246, 43770);
		Pays italie = new Pays("Italie", 60483973, 29866);
		Pays japon = new Pays("Japon", 126330302, 39058);
		Pays chine = new Pays("Chine", 1417913092, 7989);
		Pays russie = new Pays("Russie", 146780700, 11099);
		Pays inde = new Pays("Inde", 1296834042, 1626);

		Map<String, Pays> map = new HashMap<>();

		map.put("usa", usa);
		map.put("france", france);
		map.put("allemagne", allemagne);
		map.put("uk", uk);
		map.put("italie", italie);
		map.put("japon", japon);
		map.put("chine", chine);
		map.put("russie", russie);
		map.put("inde", inde);

		System.out.println(map.keySet());
		System.out.println(map.values());// ils ne sont pas dans l'ordre d'ajout
		supprimerMoinsHabitants(map);
		System.out.println(map.keySet());

	}

}
