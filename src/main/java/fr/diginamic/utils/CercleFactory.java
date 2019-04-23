package fr.diginamic.utils;

import fr.diginamic.approche_objet.entites.Cercle;

public class CercleFactory {

	public static Cercle creerCercle(double d){
		return new Cercle(d);
		
	}
}
