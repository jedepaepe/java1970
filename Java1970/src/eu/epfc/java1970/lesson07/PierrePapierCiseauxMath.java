package eu.epfc.java1970.lesson07;

import java.util.Scanner;

/*
 */
public class PierrePapierCiseauxMath {
    public static void main(String[] args) {
        // logique
        // 0 => pierre
        // 1 => papier
        // 2 => ciseaux
        // différence = utilisateur - ordinateur
        // différence == 0 => égalité
        // différence == 1 => gagné
        // différence == -2 => gagné
        Scanner input = new Scanner(System.in);
        int utilisateur = input.nextInt();
        int ordinateur = (int) (Math.random() * 3);
        if(utilisateur >= 0 || utilisateur <= 2) {
            int difference = utilisateur - ordinateur;
            switch (difference) {
                case 0:
                    System.out.println("Egalité");
                    break;
                case 1:
                case -2:
                    System.out.println("Vous avez gagné");
                    break;
                default:
                    System.out.println("Vous avez perdu");
                    break;
            }
        } else {
            System.out.println("Erreur, veuillez introduire 0 1 ou 2");
        }
    }
}
