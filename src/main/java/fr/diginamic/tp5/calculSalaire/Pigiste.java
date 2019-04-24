package fr.diginamic.tp5.calculSalaire;

public class Pigiste extends Intervenant {

	private int nbJours;
	private double montantJours;
	
	
	
	public Pigiste(String nom, String prenom, int nbJours, double montantJours) {
		super(nom, prenom);
		this.nbJours = nbJours;
		this.montantJours = montantJours;
	}



	@Override
	public double getSalaire() {
		return nbJours*montantJours;
	}

	public String afficherDonnees(){
		return super.afficherDonnees()+" Statut: pigiste";
	}
}
