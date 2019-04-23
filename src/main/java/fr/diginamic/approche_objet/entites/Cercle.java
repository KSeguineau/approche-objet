package fr.diginamic.approche_objet.entites;

public class Cercle {

	private Double rayon;

	public Cercle(Double rayon) {
		super();
		this.rayon = rayon;
	}
	
	public double perimetre(){
		return 2*rayon*Math.PI;
		
	}
	
	public double surface(){
		return 2*rayon*rayon*Math.PI;
		
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon +" périmetre="+ this.perimetre()+" surface="+this.surface()+ "]";
	}
}
