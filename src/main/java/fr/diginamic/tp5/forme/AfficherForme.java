package fr.diginamic.tp5.forme;

public class AfficherForme {
	
	public static String afficher(Forme f){
		return f.calculerSurface()+" "+f.calculerPerimetre();
	}

}
