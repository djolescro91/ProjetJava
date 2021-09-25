package fr.djolescro.programme;

public class Formule {
	// Formule Aire d'un trapèze
	public static double aireTrapeze(double grandeBase, double petiteBase, double hauteur) {

		double formule = ((grandeBase + petiteBase) * hauteur) / 2;
		return formule;
	}
	
	// Formule volume d'une Sphère ou boule
		public static double volumeSphere(double base, double hauteur) {
			double formule = (1 / 3 * base * hauteur);
			return formule;
		}
}
