package fr.diginamic.tp5.calculSalaire;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie s = new Salarie("Bobby", "Bob", 1200);
		Pigiste p = new Pigiste("Bobby", "Janne", 22, 100);

		System.out.println("salaire du salarié: " + s.getSalaire());
		System.out.println("salaire du pigiste: " + p.getSalaire());

		System.out.println(s.afficherDonnees());
		System.out.println(p.afficherDonnees());
	}

}
