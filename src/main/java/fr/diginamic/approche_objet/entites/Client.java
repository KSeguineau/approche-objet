package fr.diginamic.approche_objet.entites;

public class Client {

	private int numeroCompte;
	private String nom;
	private String prenom;
	private AdressePostale adr;
	
	
	
	
	public Client(int numeroCompte, String nom, String prenom) {
		super();
		this.numeroCompte = numeroCompte;
		this.nom = nom;
		this.prenom = prenom;
		System.out.println("nouvelle instance créée");
	}


	public Client(int num,String n, String p,AdressePostale a){
		this(num,n,p);
		this.adr = a;
	}


	
	public int getNumeroCompte() {
		return numeroCompte;
	}


	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}


	public String getNom() {
		return nom.toUpperCase();
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom.toUpperCase();
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public AdressePostale getAdr() {
		return adr;
	}


	public void setAdr(AdressePostale adr) {
		this.adr = adr;
	}


	@Override
	public String toString() {
		return "Client [numeroCompte=" + numeroCompte + ", nom=" + nom.toUpperCase() + ", prenom=" + prenom.toUpperCase() + ", adr=" + adr + "]";
	}



	
	
}
