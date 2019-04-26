package fr.diginamic.tp6.CalculerSurface;

import fr.diginamic.tp5.forme.Cercle;
import fr.diginamic.tp5.immobilier.Chambre;
import fr.diginamic.tp5.immobilier.Cuisine;
import fr.diginamic.tp5.immobilier.Maison;
import fr.diginamic.tp5.immobilier.SalleDeBain;
import fr.diginamic.tp5.immobilier.Salon;
import fr.diginamic.tp5.immobilier.WC;

public class TestAffichageSurface {

	public static void main(String[] args) {

		Cercle cercle = new Cercle(4);

		Chambre ch1 = new Chambre(1, 13);
		Chambre ch2 = new Chambre(1, 15);
		Cuisine c1 = new Cuisine(0, 10);
		Salon s1 = new Salon(0, 25);
		SalleDeBain sal1 = new SalleDeBain(0, 12);
		WC wc = new WC(0, 3);

		Maison maison = new Maison();
		maison.ajouterPiece(ch1).ajouterPiece(ch2).ajouterPiece(c1).ajouterPiece(s1).ajouterPiece(sal1)
				.ajouterPiece(wc);

		System.out.println(AffichageSurface.afficher(maison));
		System.out.println(AffichageSurface.afficher(cercle));

	}

}
