package fr.diginamic.tp5.immobilier;

public abstract class Piece {

	protected int etage;
	protected double superficie;

	public Piece(int etage, double superficie) {
		super();
		this.etage = etage;
		this.superficie = superficie;
	}

	public double getSuperficie() {
		return superficie;
	}

	public abstract String getType();

	public int getEtage() {
		return etage;
	}

}
