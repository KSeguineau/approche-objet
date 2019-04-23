package fr.diginamic.approche_objet.essais;

import fr.diginamic.approche_objet.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Cercle c1 = CercleFactory.creerCercle(3.4);
	Cercle c2 = CercleFactory.creerCercle(8.4);
		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
