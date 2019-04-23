package fr.diginamic.approche_objet.essais;

import fr.diginamic.approche_objet.entites.Client;;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client a = new Client(23451,"bob","bobby");
		Client b = new Client(987367,"Jiji","bob");
		
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}
