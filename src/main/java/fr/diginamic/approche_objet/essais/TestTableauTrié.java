package fr.diginamic.approche_objet.essais;

import java.util.ArrayList;

import fr.diginamic.utils.TriTableau;

public class TestTableauTrié {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> tab = new ArrayList<Integer>();
		
		tab.add(18);
		tab.add(32);
		tab.add(42);
		tab.add(2);
		tab.add(89);
		tab.add(1);
		tab.add(87);
		tab.add(24);
		tab.add(18);
		
		TriTableau.triTableau(tab);
		System.out.println(tab.toString());
		
	}

}
