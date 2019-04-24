package fr.diginamic.tp5.forme;

public class Cercle extends Forme {

	private double rayon;
	
	
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		return this.rayon*this.rayon*Math.PI;
	}

	@Override
	public double calculerPerimetre() {
		return 2*this.rayon*Math.PI;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
