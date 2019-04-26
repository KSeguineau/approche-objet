package fr.diginamic.tp5.immobilier;

import java.util.ArrayList;

import fr.diginamic.tp6.CalculerSurface.ISurface;

/**
 * @author Kevin.s
 *
 */
public class Maison implements ISurface {

	private ArrayList<Piece> tabPiece;

	public Maison() {
		super();
		this.tabPiece = new ArrayList<Piece>();
	}

	public Maison(ArrayList<Piece> tabPiece) {
		super();
		this.tabPiece = tabPiece;
	}

	public Maison ajouterPiece(Piece p) {
		tabPiece.add(p);
		return this;
	}

	/**
	 * @return La superficie totale de la maison
	 */
	public double calculerSurface() {
		// fait la somme d'un stream de Double des superficie des pieces creer à
		// partir du tableau de pieces
		return tabPiece.stream().mapToDouble(Piece::getSuperficie).sum();

	}

	public double superficieEtage(int i) {
		return tabPiece.stream().filter(p -> p.getEtage() == i).mapToDouble(Piece::getSuperficie).sum();
	}

	public double superficieTotPiece(String t) {
		// filter va creer un stream contenant uniquement les pieces du type de
		// t
		return tabPiece.stream().filter(p -> p.getType().equals(t)).mapToDouble(Piece::getSuperficie).sum();

	}

	public long nbPiece(String t) {

		return tabPiece.stream().filter(p -> p.getType().equals(t)).count();

	}

}
