package fr.diginamic.tp8.sets.ex3;

import java.text.DecimalFormat;

public class Pays {

	String nom;
	long nbHabitants;
	long pibHab;
	DecimalFormat formateur = new DecimalFormat("###,###");

	public Pays(String nom, long nbHabitants, long pib) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibHab = pib;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitants=" + formateur.format(nbHabitants) + ", pib total="
				+ formateur.format(pibHab * nbHabitants) + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public long getPib() {
		return pibHab;
	}

	public void setPib(long pib) {
		this.pibHab = pib;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (nbHabitants ^ (nbHabitants >>> 32));
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + (int) (pibHab ^ (pibHab >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pays other = (Pays) obj;
		if (nbHabitants != other.nbHabitants)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (pibHab != other.pibHab)
			return false;
		return true;
	}

}
