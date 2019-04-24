package fr.diginamic.tp5.immobilier;

import java.util.ArrayList;

public class Maison {

	private ArrayList<Piece> tabPiece;

	public Maison() {
		super();
		this.tabPiece = new ArrayList<Piece>();
	}

	public Maison(ArrayList<Piece> tabPiece) {
		super();
		this.tabPiece = tabPiece;
	}

	public void ajouterPiece(Piece p) {
		tabPiece.add(p);
	}

	public double superficieTotale() {
		double tot = 0;
		for (int i = 0; i < tabPiece.size(); i++) {
			tot += tabPiece.get(i).getSuperficie();
		}
		return tot;
	}

	public double superficieTotPiece(String t) {
		double tot = 0;
		for (int i = 0; i < tabPiece.size(); i++) {
			if (tabPiece.get(i).getType().equals(t)) {
				tot += tabPiece.get(i).getSuperficie();
			}
		}
		return tot;
	}

	public int nbPiece(String t) {
		int tot = 0;
		for (int i = 0; i < tabPiece.size(); i++) {
			if (tabPiece.get(i).getType().equals(t)) {
				tot++;
			}
		}
		return tot;
	}

}
