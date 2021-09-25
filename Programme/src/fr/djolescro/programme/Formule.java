package fr.djolescro.programme;

public class Formule {
	public static double aireTrapeze(double grandeBase, double petiteBase, double hauteur) {
		double formule = ((grandeBase + petiteBase) * hauteur) / 2;
		return formule;
	}
}
