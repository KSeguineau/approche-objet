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


	@Override
	public String toString() {
		return "Client [numeroCompte=" + numeroCompte + ", nom=" + nom + ", prenom=" + prenom + ", adr=" + adr + "]";
	}



	
	
}
