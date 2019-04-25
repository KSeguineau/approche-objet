package fr.diginamic.tp5.immobilier;

public class TestMaison {

	public static void main(String[] args) {

		Chambre ch1 = new Chambre(1, 13);
		Chambre ch2 = new Chambre(1, 15);
		Cuisine c1 = new Cuisine(0, 10);
		Salon s1 = new Salon(0, 25);
		SalleDeBain sal1 = new SalleDeBain(0, 12);
		WC wc = new WC(0, 3);

		Maison maison = new Maison();
		maison.ajouterPiece(ch1).ajouterPiece(ch2).ajouterPiece(c1).ajouterPiece(s1).ajouterPiece(sal1)
				.ajouterPiece(wc);

		System.out.println("superficie totale" + maison.superficieTotale());
		System.out.println("superficie du RDC" + maison.superficieEtage(0));
		System.out.println("superficie chambre " + maison.superficieTotPiece("Chambre"));
		System.out.println("superficie salon " + maison.superficieTotPiece("Salon"));
		System.out.println("superficie cuisine " + maison.superficieTotPiece("Cuisine"));

		System.out.println("nb chambres " + maison.nbPiece("Chambre"));
	}

}
