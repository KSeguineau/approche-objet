package fr.diginamic.tp5.forme;

public class TestForme {

	public static void main(String[] args) {
		Cercle c1 = new Cercle(5);
		Rectangle r1 = new Rectangle(3, 5);
		Carre car1 = new Carre(4);
		
		System.out.println("Cercle: "+AfficherForme.afficher(c1));
		System.out.println("Rectangle: "+AfficherForme.afficher(r1));
		System.out.println("Carre: "+AfficherForme.afficher(car1));

	}

}
