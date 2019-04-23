package fr.diginamic.approche_objet.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculMoyenne c1 = new CalculMoyenne(-3);
		CalculMoyenne c2 = new CalculMoyenne(10);
		
		c1.ajout(13);
		c1.ajout(2);
		c1.ajout(15);
		c1.ajout(18);
		c1.ajout(4);
		
		c2.ajout(12);
		c2.ajout(23);
		c2.ajout(43);
		c2.ajout(234);
		c2.ajout(1);
		
		System.out.println(c1.calcul());
		System.out.println(c2.calcul());

		
	}

}
