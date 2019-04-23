package fr.diginamic.approche_objet.entites;

public class Client {

	private int numeroCompte;
	private String nom;
	private String prenom;
	
	
	
	public Client(int num,String n, String p){
		this.numeroCompte = num;
		this.nom = n;
		this.prenom = p;
		System.out.println("nouvelle instance créée");
	}



	@Override
	public String toString() {
		return "Client [numeroCompte=" + numeroCompte + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
}
