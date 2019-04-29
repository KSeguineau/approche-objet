package fr.diginamic.tp8.sets.ex3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestPays {

	public static Pays plusGrandPibHab(Set<Pays> set) {

		Iterator<Pays> it = set.iterator();
		Pays plusGrosPib = null;
		if (it.hasNext()) {
			plusGrosPib = it.next();
			while (it.hasNext()) {
				Pays tmp = it.next();
				if (tmp.getPib() > plusGrosPib.getPib()) {
					plusGrosPib = tmp;
				}
			}
		}
		return plusGrosPib;
	}

	public static Pays plusGrandPibTot(Set<Pays> set) {

		Iterator<Pays> it = set.iterator();
		Pays plusGrosPib = null;
		if (it.hasNext()) {
			plusGrosPib = it.next();
			while (it.hasNext()) {
				Pays tmp = it.next();
				if (tmp.getPib() * tmp.getNbHabitants() > plusGrosPib.getPib() * plusGrosPib.getNbHabitants()) {
					plusGrosPib = tmp;
				}
			}
		}
		return plusGrosPib;
	}

	public static void majPlusPetitPib(Set<Pays> set) {
		Iterator<Pays> it = set.iterator();
		Pays plusPetitPib = null;
		if (it.hasNext()) {
			plusPetitPib = it.next();
			while (it.hasNext()) {
				Pays tmp = it.next();
				if (tmp.getPib() * tmp.getNbHabitants() < plusPetitPib.getPib() * plusPetitPib.getNbHabitants()) {
					plusPetitPib = tmp;
				}
			}

			set.remove(plusPetitPib);
			plusPetitPib.setNom(plusPetitPib.getNom().toUpperCase());
			set.add(plusPetitPib);
			System.out.println(plusPetitPib);
		}
	}

	public static void suprimerPlusPetitPib(Set<Pays> set) {
		Iterator<Pays> it = set.iterator();
		Pays plusPetitPib = null;
		if (it.hasNext()) {
			plusPetitPib = it.next();
			while (it.hasNext()) {
				Pays tmp = it.next();
				if (tmp.getPib() * tmp.getNbHabitants() < plusPetitPib.getPib() * plusPetitPib.getNbHabitants()) {
					plusPetitPib = tmp;
				}
			}

			set.remove(plusPetitPib);
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

		Set<Pays> hashset = new HashSet<>();
		hashset.addAll(Arrays.asList(usa, france, allemagne, uk, italie, japon, chine, russie, inde));

		System.out.println(plusGrandPibHab(hashset));
		System.out.println(plusGrandPibTot(hashset));
		majPlusPetitPib(hashset);
		System.out.println(hashset);
		suprimerPlusPetitPib(hashset);
		System.out.println(hashset);
	}

}
