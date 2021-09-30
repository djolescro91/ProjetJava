package fr.djolescro.programme;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// Variables pour la formule aire du trapeze
		
		double grandeBase = 20;
		double petiteBase = 15;
		double hauteur = 7;

		// Affichage
		
		// System.out.println("L'aire du trapeze est égal a : " + String.format("%.2f", Formule.aireTrapeze(grandeBase, petiteBase, hauteur)));
		
		// Exercices
		
		
		String managers[] = new String[] {"Jennifer", "Aurélien", "Bakari", "Gianni"};
		
		Arrays.sort(managers);
		
		for(String manager : managers) {
			System.out.println("Nous avons comme manager " + manager);
		}
	}
	
}