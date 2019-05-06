package fr.diginamic.tp5.immobilier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MaisonTest {

	@Test
	public void testAjouterPiece1() {
		Maison maisonTest = new Maison();
		Chambre a = new Chambre(0, 12);
		maisonTest.ajouterPiece(a);
		assertTrue(maisonTest.getTabPiece().indexOf(a) != -1);
	}

	@Test
	public void testAjouterPiece2() {
		Maison maisonTest = new Maison();
		maisonTest.ajouterPiece(null);
		maisonTest.calculerSurface();
	}

	@Test
	public void testCalculerSurface1() {
		Maison maisonTest = new Maison();
		Chambre a = new Chambre(0, 12);
		Cuisine b = new Cuisine(0, 12);
		Salon c = new Salon(0, 12);
		maisonTest.ajouterPiece(a).ajouterPiece(b).ajouterPiece(c);
		assertEquals(0.0001, 36, maisonTest.calculerSurface());
	}

	@Test
	public void testCalculerSurface2() {
		Maison maisonTest = new Maison();
		Chambre a = new Chambre(0, 12);
		Cuisine b = null;
		Salon c = new Salon(0, 12);
		maisonTest.ajouterPiece(a).ajouterPiece(b).ajouterPiece(c);
		assertEquals(0.0001, 24, maisonTest.calculerSurface());
	}

	@Test
	public void testSuperficieEtage() {
		Maison maisonTest = new Maison();
		Chambre a = new Chambre(0, 12);
		Cuisine b = new Cuisine(1, 12);
		Salon c = new Salon(0, 12);
		maisonTest.ajouterPiece(a).ajouterPiece(b).ajouterPiece(c);
		assertEquals(0.0001, 24, maisonTest.superficieEtage(0));
	}

	@Test
	public void testSuperficieTotPiece() {
		Maison maisonTest = new Maison();
		Chambre a = new Chambre(0, 12);
		Chambre b = new Chambre(1, 12);
		Salon c = new Salon(0, 12);
		maisonTest.ajouterPiece(a).ajouterPiece(b).ajouterPiece(c);
		assertEquals(0.0001, 24, maisonTest.superficieTotPiece("Chambre"));
	}

	@Test
	public void testNbPiece() {
		Maison maisonTest = new Maison();
		Chambre a = new Chambre(0, 12);
		Chambre b = new Chambre(1, 12);
		Salon c = new Salon(0, 12);
		maisonTest.ajouterPiece(a).ajouterPiece(b).ajouterPiece(c);
		assertEquals(2, maisonTest.nbPiece("Chambre"));
	}
}
