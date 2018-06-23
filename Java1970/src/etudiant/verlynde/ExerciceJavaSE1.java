/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.verlynde;


import java.util.Scanner;

/**
 *
 * @author 0907thverlynde
 */
public class ExerciceJavaSE1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez introduire une phrase ?"); // #prof# phrase endehors du while +2
        String phrase = scan.nextLine();
        String action = "";
        while (!action.equals("quit")) {    // #prof# do{...}while est plus adapté
            System.out.println("Quelle action exécuter ? (tapez \"help\" pour obtenir l'aide):");
            action = scan.nextLine();
            switch (action) {
                case "help":
                    System.out.println("Tapez \"min\" pour mettre le texte en minuscules"   // #prof# mieux dans une fonction
                            + "\n"
                            + "Tapez \"MAJ\" pour mettre le texte en minuscules"
                            + "\n"
                            + "Tapez \"Cap\" pour mettre le texte avec une première lettre capitale"
                            + "\n"
                            + "Tapez \"CountWord\" pour compter le nombre de mots de la phrase"
                            + "\n"
                            + "Tapez \"CountChar\" pour compter le nombre de caractères de la phrase"
                            + "\n"
                            + "Tapez \"Search\" pour compter le nombre d'occurences d'un motif"
                            + "\n"
                            + "Tapez \"quit\" pour quitter le programme"
                            + "\n"
                    );
                    break;

                case "quit":
                    System.out.println("Merci d'avoir été avec nous");
                    System.exit(0);
                    break;
                case "min":
                    System.out.println(phrase.toLowerCase());
                    break;
                case "MAJ":
                    System.out.println(phrase.toUpperCase());
                    break;
                case "Cap":
                    System.out.println(phrase.substring(0, 1).toUpperCase() + phrase.substring(1));
                    break;
                case "CountChar":
                    System.out.println("La phrase contient " + phrase.length() + " caractères.");
                    break;
                case "CountWord":
                    System.out.println("La phrase contient " + phrase.split("\\w+").length + " mots.");
                    break;
                case "Search":
                    System.out.println("Quel motif voulez-vous chercher ?");
                    String search = scan.nextLine();
                    System.out.println("La phrase contient " + (phrase.split(search, -1).length-1) + " fois le motif.");
                    break;
                default:
                    System.out.println("Commande non autorisée, tapez \"help\" pour afficher l'aide.");
                    break;
            }

        }
    }
}
