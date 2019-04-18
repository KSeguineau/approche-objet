package fr.diginamic.approche_objet.entites;

public class AdressePostale {
	
	private int numero;
	private String lib;
	private int dep;
	private String ville;
	
	public AdressePostale(int n,String l,int d,String v){
		this.numero = n;
		this.lib = l;
		this.dep = d;
		this.ville = v;
	}

	public String toString() {
		return   numero + " " + lib + " " + dep + " " + ville;
	}

	
	
	
}
