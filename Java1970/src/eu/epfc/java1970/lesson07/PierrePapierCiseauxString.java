package eu.epfc.java1970.lesson07;

import java.util.Scanner;

/*
 * 3.17 (p.111) pierre, papier, ciseaux contre l'ordinateur
 */
public class PierrePapierCiseauxString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String utilisateur = input.next();
        int index = (int) (Math.random() * 3);
        String ordinateur = "";
        switch(index) {
            case 0: ordinateur = "pierre"; break;
            case 1: ordinateur = "papier"; break;
            case 2: ordinateur = "ciseaux"; break;
            default: 
                System.out.println("Error index invalide " + index);
                System.exit(-1);        // force l'arrêt du programme
        }
        switch (utilisateur) {
            case "pierre":
                switch(ordinateur) {
                    case "pierre":
                        System.out.println("Egalité : " + utilisateur + " contre " + ordinateur);
                        break;
                    case "papier":
                        System.out.println("Vous avez perdu : " + utilisateur + " contre " + ordinateur);
                        break;
                    case "ciseaux":
                        System.out.println("Vous avez gagné : "  + utilisateur + " contre " + ordinateur);
                        break;
                    default:
                        System.out.println("Erreur, l'ordinateur a tiré un nombre invalide " + ordinateur);
                }
                break;
            case "papier":
                switch(ordinateur) {
                    case "pierre":
                        System.out.println("Vous avez gagné : " + utilisateur + " contre " + ordinateur);
                        break;
                    case "papier":
                        System.out.println("Egalité : "  + utilisateur + " contre " + ordinateur);
                        break;
                    case "ciseaux":
                        System.out.println("Vous avez perdu : " + utilisateur + " contre " + ordinateur);
                        break;
                    default:
                        System.out.println("Erreur, l'ordinateur a tiré un nombre invalide " + ordinateur);
                }
                break;
            case "ciseaux":
                switch(ordinateur) {
                    case "pierre":
                        System.out.println("Vous avez perdu : " + utilisateur + " contre " + ordinateur);
                        break;
                    case "papier":
                        System.out.println("Vous avez gagné : " + utilisateur + " contre " + ordinateur);
                        break;
                    case "ciseaux":
                        System.out.println("Egalité : " + utilisateur + " contre " + ordinateur);
                        break;
                    default:
                        System.out.println("Erreur, l'ordinateur a tiré un nombre invalide " + ordinateur);
                }
                break;
            default:
                System.out.println("Veuillez introduire pierre ou papier ou ciseaux");
        }
    }
}
