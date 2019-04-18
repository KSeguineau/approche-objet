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


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public AdressePostale getAdd() {
		return add;
	}


	public void setAdd(AdressePostale add) {
		this.add = add;
	}
	
	
	

}
