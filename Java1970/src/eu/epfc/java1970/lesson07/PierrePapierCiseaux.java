package eu.epfc.java1970.lesson07;

import java.util.Scanner;

/*
 * 3.17 (p.111) pierre, papier, ciseaux contre l'ordinateur
 */
public class PierrePapierCiseaux {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int utilisateur = input.nextInt();
        int ordinateur = (int) (Math.random() * 3);
        switch (utilisateur) {
            case 0: // pierre
                switch(ordinateur) {
                    case 0: // pierre
                        System.out.println("Egalité : pierre contre pierre");
                        break;
                    case 1:
                        System.out.println("Vous avez perdu : pierre contre papier");
                        break;
                    case 2:
                        System.out.println("Vous avez gagné : pierre contre ciseaux");
                        break;
                    default:
                        System.out.println("Erreur, l'ordinateur a tiré un nombre invalide " + ordinateur);
                }
                break;
            case 1: // papier
                switch(ordinateur) {
                    case 0: // pierre
                        System.out.println("Vous avez gagné : papier contre pierre");
                        break;
                    case 1:
                        System.out.println("Egalité : papier contre papier");
                        break;
                    case 2:
                        System.out.println("Vous avez perdu : papier contre ciseaux");
                        break;
                    default:
                        System.out.println("Erreur, l'ordinateur a tiré un nombre invalide " + ordinateur);
                }
                break;
            case 2: // ciseaux
                switch(ordinateur) {
                    case 0: // pierre
                        System.out.println("Vous avez perdu : ciseaux contre pierre");
                        break;
                    case 1:
                        System.out.println("Vous avez gagné : ciseaux contre papier");
                        break;
                    case 2:
                        System.out.println("Egalité : ciseaux contre ciseaux");
                        break;
                    default:
                        System.out.println("Erreur, l'ordinateur a tiré un nombre invalide " + ordinateur);
                }
                break;
            default:
                System.out.println("Veuillez introduire 0 1 ou 2");
        }
    }
}
