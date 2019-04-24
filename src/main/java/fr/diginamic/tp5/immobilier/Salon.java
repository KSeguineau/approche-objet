package fr.diginamic.tp5.immobilier;

public class Salon extends Piece {

	public Salon(int etage, double superficie) {
		super(etage, superficie);
	}

	@Override
	public String getType() {
		return "Salon";
	}
}
