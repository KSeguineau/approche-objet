package fr.diginamic.tp5.calculSalaire;

public class Salarie extends Intervenant {

	private double salaire;
	
	
	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}


	@Override
	public double getSalaire() {
		return this.salaire;
	}

	public String afficherDonnees(){
		return super.afficherDonnees()+" Statut: salarié";
	}
}
