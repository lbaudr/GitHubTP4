/*
 * UtilisationDuree.java
 */

package lesdurees;

import java.util.Scanner;

/**
 * Utilisation des méthodes traitant les durées
 */
public class UtilisationDuree {
	
	// Ceci est un commentaire inutile

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         testEstChaineDuree();
         testCombienDifferente();
         testOrdre();
    }
    

    // ////////////////////////////////////////////////////////////////////
    // Méthodes utilisées pour tester les méthodes précédentes //
    // ////////////////////////////////////////////////////////////////////


    /**
     * 
     */
	public static void testCombienDifferente() {
	    int[] d1; // première durée
	    int[] d2; // deuxième durée
	    int[] d3; // troisième
	
	    d1 = DureeHMS.saisirDuree("Saisie de la première durée : ");
	    d2 = DureeHMS.saisirDuree("Saisie de la deuxième durée : ");
	    d3 = DureeHMS.saisirDuree("Saisie de la troisième durée : ");
	
	    System.out.println("Parmi ces 3 durées, "
	            + DureeHMS.combienDifferentes(d1, d2, d3) + " sont différentes.");
	
	}

	public static void testOrdre() {
	    int[] d1; // première durée
	    int[] d2; // deuxième durée
	    int[] d3; // troisième
	
	    d1 = DureeHMS.saisirDuree("Saisie de la première durée : ");
	    d2 = DureeHMS.saisirDuree("Saisie de la deuxième durée : ");
	    d3 = DureeHMS.saisirDuree("Saisie de la troisième durée : ");
	
	    System.out.println("ces 3 durées sont "
	            + (DureeHMS.ordre(d1, d2, d3) ? " ordonnées " : " dans le désordre"));
	
	}

	public static void testEstChaineDuree() {
	    Scanner entree = new Scanner(System.in);
	    String phrase;
	    System.out.print("Vous allez entrer une chaine et le programme verifiera"
	    		+ "si elle est bien dans le format hh:mm:ss"
	    		+ "\nLe separateur ':' peut etre remplace par n'importe quel caractere."
	    		+ "\n\t==> ");
	    phrase = entree.nextLine();
	    if (DureeHMS.estChaineDuree(phrase)) {
	        System.out.println("La chaine " + phrase + " respecte bien le format hh:mm:ss.");
	    } else {
	        System.out.println("La chaine " + phrase + " ne respecte pas le format hh:mm:ss.");
	    }
	}

}