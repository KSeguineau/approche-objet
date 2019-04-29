package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import fr.diginamic.tp8.sets.ex3.Pays;

public class TestTriPays {

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

		List<Pays> list = new ArrayList<>();
		list.addAll(Arrays.asList(usa, france, allemagne, uk, italie, japon, chine, russie, inde));

		Comparator compPib = new ComparatorPibHab();
		Comparator compHab = new ComparatorHabitant();

		Collections.sort(list);
		System.out.println(list);
		list.sort(compPib);
		System.out.println(list);
		list.sort(compHab);
		System.out.println(list);

	}

}
