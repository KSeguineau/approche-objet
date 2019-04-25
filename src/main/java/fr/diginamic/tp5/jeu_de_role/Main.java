package fr.diginamic.tp5.jeu_de_role;

import java.util.Scanner;

import fr.diginamic.tp5.jeu_de_role.utils.JeuUtils;

public class Main {

	public static void main(String[] args) {

		Scanner entree = new Scanner(System.in);
		Personnage perso = null;
		boolean sortir = false;

		while (sortir == false) {

			System.out.print("1 pour creer un nouveau personnage\n 2 pour combattre une créature\n 3 pour sortir");
			int choix = entree.nextInt();

			switch (choix) {

			case 1:
				perso = new Personnage();
				System.out.println("Vous venez de creer un personnage avec les stats suivantes : " + perso.toString());
				break;
			case 2:
				if (perso != null && perso.getPv() > 0) {
					boolean enVie = JeuUtils.combat(perso);

					if (enVie) {
						System.out.println("Beau combat, vous avez " + perso.getScore() + " points");
					} else {
						System.out.println("Dommage vous êtes mort avec " + perso.getScore() + " points");
					}

				} else {
					System.out.println("Vous n'avez pas creer de personnage ou votre personnage est mort");
				}
				break;
			case 3:
				sortir = true;
				break;
			default:
				System.out.println("commande inconnue");
				break;
			}
		}
	}

}
