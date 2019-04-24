package fr.diginamic.tp5.calculSalaire;

/**
 * @author Kevin.s
 *
 */

public abstract class Intervenant {

	protected String nom;
	protected String prenom;

	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();

	/**
	 * 
	 * @return les donnees de l'intervenant
	 */
	public String afficherDonnees() {
		return nom + " " + prenom + " " + this.getSalaire();
	}

}
