/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.rousseau;


import java.util.Scanner;

public class ExJava {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String choix;
        System.out.print("Tapez une phrase : ");    // #prof# excellent - il ne faut pas retaper la phrase +2
        String phrase = input.nextLine();

        do {
            System.out.print("Quel action souhaitez-vous ? A = aide : ");
            choix = input.next();
            switch (choix) {
                case "A":
                    System.out.println("Les actions possibles sont les suivantes : ");  // #prof# mieux dans une fonction
                    System.out.println("A : afficher l'aide");
                    System.out.println("B : mettre en majuscules");
                    System.out.println("C : mettre en minuscules");
                    System.out.println("D : mettre en capitalisé");
                    System.out.println("E : compter le nombre de caractères");
                    System.out.println("F : compter le nombre de mot");
                    System.out.println("G : rechercher un motif dans la phrase et donner le nombre d'occurrences d'un motif ");
                    System.out.println("Q : quitter l'application");
                    System.out.print("Quel action souhaitez-vous ? A = aide : ");
                    choix = input.next();   // #prof# bizarre -1
                    break;
                case "B": //mettre en majuscules
                    System.out.println(phrase.toUpperCase());
                    break;
                case "C": //mettre en minuscules
                    System.out.println(phrase.toLowerCase());
                    break;
                case "E": //compter le nombre de caractères
                    String phraseSansEspace = phrase.replaceAll(" ", "");
                    int nombreEspace = phrase.length() - phraseSansEspace.length(); // #prof# peu faire plus simple -1
                    System.out.println((phrase.length() - nombreEspace));
                    break;
                case "G": //rechercher un motif
                    System.out.print("Quel motif ? ");
                    String motif = input.next();
                    System.out.println(phrase.contains(motif));
                    break;
                default:
                    System.out.println("Choix non valide");     // #prof# Q tombe dans choix non valide -1
            }
        } while (!choix.equals("Q"));
    }

}
