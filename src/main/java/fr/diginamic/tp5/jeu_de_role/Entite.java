package fr.diginamic.tp5.jeu_de_role;

import static fr.diginamic.tp5.jeu_de_role.utils.Randomutils.getRand;

public abstract class Entite {

	protected int force;
	protected int pv;
	protected int score;

	public Entite(int force, int pv, int score) {
		super();
		this.force = force;
		this.pv = pv;
		this.score = score;
	}

	public int attaque() {

		return force + getRand(1, 10);
	}

	@Override
	public String toString() {
		return "[force=" + force + ", pv=" + pv + "]";
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
