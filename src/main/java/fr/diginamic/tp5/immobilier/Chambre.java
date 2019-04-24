package fr.diginamic.tp5.immobilier;

public class Chambre extends Piece {

	public Chambre(int etage, double superficie) {
		super(etage, superficie);
	}

	@Override
	public String getType() {
		return "Chambre";
	}

}
