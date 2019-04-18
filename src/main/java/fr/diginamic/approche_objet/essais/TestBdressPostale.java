package fr.diginamic.approche_objet.essais;

import fr.diginamic.approche_objet.entites.*;

public class TestBdressPostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//AdressePostale
		AdressePostale a1 = new AdressePostale(3, "Rue de chez moi", 44000, "Nantes");
		AdressePostale a2 = new AdressePostale(5, "Rue de chez toi", 44000, "Nantes");
		
		Personne p1 = new Personne("bobby","bob", a1);
		Personne p2 = new Personne("bobby","anne", a2);

		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
