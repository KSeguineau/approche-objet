package fr.diginamic.approche_objet.entites;

public class AdressePostale {
	
	private int numero;
	private String lib;
	private int dep;
	private String ville;
	public static int nbDepartements = 101;
	
	public AdressePostale(int n,String l,int d,String v){
		this.numero = n;
		this.lib = l;
		this.dep = d;
		this.ville = v;
	}

	public String toString() {
		return   numero + " " + lib + " " + dep + " " + ville;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLib() {
		return lib;
	}

	public void setLib(String lib) {
		this.lib = lib;
	}

	public int getDep() {
		return dep;
	}

	public void setDep(int dep) {
		this.dep = dep;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	
	
	
}
