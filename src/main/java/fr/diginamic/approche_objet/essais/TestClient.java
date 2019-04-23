package fr.diginamic.approche_objet.essais;

import fr.diginamic.approche_objet.entites.Client;
import fr.diginamic.approche_objet.entites.AdressePostale;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client a = new Client(23451,"bob","bobby");
		Client b = new Client(987367,"Jiji","bob");
		AdressePostale ad= new AdressePostale(3, "rue de chez moi", 44000, "Nantes");
		Client c = new Client(89304, "tom", "tommy", ad);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
	}

}
