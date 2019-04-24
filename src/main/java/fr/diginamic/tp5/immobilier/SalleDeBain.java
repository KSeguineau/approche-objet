package fr.diginamic.tp5.immobilier;

public class SalleDeBain extends Piece {

	public SalleDeBain(int etage, double superficie) {
		super(etage, superficie);
	}

	@Override
	public String getType() {
		return "SalleDeBain";
	}
}
