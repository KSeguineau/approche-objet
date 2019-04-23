package fr.diginamic.approche_objet.essais;

import fr.diginamic.approche_objet.entites.AdressePostale;

public class TestAttributClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale a = new AdressePostale(3, "rue de chez moi", 44000, "Nantes");
		AdressePostale b = new AdressePostale(5, "rue de chez toi", 44300, "Nantes");
		
		System.out.println(a.nbDepartements);
		System.out.println(b.nbDepartements);
		
		AdressePostale.nbDepartements = 102;
		
		System.out.println(a.nbDepartements);
		System.out.println(b.nbDepartements);
		System.out.println(AdressePostale.nbDepartements);
		
		AdressePostale.nbDepartements = 103;
		
		System.out.println(a.nbDepartements);
		System.out.println(b.nbDepartements);
		System.out.println(AdressePostale.nbDepartements);
		
	}

}
