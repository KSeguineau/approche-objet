package fr.diginamic.approche_objet.entites;

public class Personne {
	
	private String nom;
	private String prenom;
	private AdressePostale add;
	
	
	public Personne(String n, String p, AdressePostale a) {
		this.nom = n;
		this.prenom = p;
		this.add = a;
	}


	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", add=" + add + "]";
	}
	
	
	

}
