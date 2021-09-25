package fr.djolescro.programme;

public class Main {

	public static void main(String[] args) {

		// Variables
		double grandeBase = 20;
		double petiteBase = 15;
		double hauteur = 7;

		// Affichage
		System.out.println("L'aire du trapeze est égal a : " + String.format("%.2f", Formule.aireTrapeze(grandeBase, petiteBase, hauteur)));
	}

}
