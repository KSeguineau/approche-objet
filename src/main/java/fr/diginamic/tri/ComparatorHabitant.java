package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.tp8.sets.ex3.Pays;

public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays arg0, Pays arg1) {
		if (arg0.getNbHabitants() == arg1.getNbHabitants()) {
			return 0;
		} else if (arg0.getNbHabitants() < arg1.getNbHabitants()) {
			return -1;
		} else {
			return 1;
		}
	}

}
