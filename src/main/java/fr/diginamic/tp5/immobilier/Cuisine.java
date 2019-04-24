package fr.diginamic.tp5.immobilier;

public class Cuisine extends Piece {

	public Cuisine(int etage, double superficie) {
		super(etage, superficie);
	}

	@Override
	public String getType() {
		return "Cuisine";
	}
}
