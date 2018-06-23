/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.pestel;


import java.util.Scanner;

public class ApplicationEnLigneDeCommandes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choix;

        System.out.print("Phrase: ");
        String phrase = scanner.nextLine();
        System.out.println("M : pour mettre en majuscules");    // #prof# mieux dans une fonction -1
        System.out.println("m : pour mettre en minuscules");
        System.out.println("C : pour capitaliser les mots");
        System.out.println("n : pour afficher le nombre de caractères");
        System.out.println("w : pour afficher le nombre de mots");
        System.out.println("s : pour compter le nombre d'occurence d'un motif");
        System.out.println("h : pour afficher l'aide");
        System.out.println("Q : pour quitter l'application");
        
        
        do {    // #prof# excellent - ne redemande pas la phrase +2

            System.out.print("Action: ");
            choix = scanner.next();
            switch (choix) {
                case "M":
                    mettreEnMajuscules(phrase);
                    break;
                case "m":
                    mettreEnMinuscules(phrase);
                    break;
                case "C":
                    capitaliserLesMots(phrase);
                    break;
                case "n":
                    nombreDesCaracteres(phrase);
                    break;
                case "w":
                    nombreDesMots(phrase);
                    break;
                case "s":
                    nombreDOccurances(phrase);
                    break;
                case "h":
                    afficheAide();
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Choix incorrect, seuls 1, 2, 3 et Q sont permis");
            }
        } while (!choix.equals("Q"));
        System.out.println("Goodbye");
    }

    private static void mettreEnMajuscules(String phrase) {
        System.out.println(phrase.toUpperCase());
    }

    private static void mettreEnMinuscules(String phrase) {
        System.out.println(phrase.toLowerCase());
        
    }

    private static void capitaliserLesMots(String phrase) {

    }

    private static void nombreDesCaracteres(String phrase) {    // #prof# mieux si la fonction retourne un int
        //System.out.println(phrase.length());  // #prof# c'est ce que je demandais
        
        String csvRecord = phrase + "";
        //System.out.println(csvRecord);
        String[] csvAttributes = csvRecord.split(" ");
        
        int nombreDeCaracteres = 0;
        
        for(int i = 0; i < csvAttributes.length; ++i){
            nombreDeCaracteres = nombreDeCaracteres + csvAttributes[i].length();
        }
        System.out.println(nombreDeCaracteres); // #prof# mieux si l'affichage est réservé à la méthode main
    }

    private static void nombreDesMots(String phrase) {
        String csvRecord = phrase + "";
        String[] csvAttributes = csvRecord.split(" ");
        
        int nombreDeMot = csvAttributes.length;
        System.out.println(nombreDeMot);
    }

    private static void nombreDOccurances(String phrase) {
        
    }

    private static void afficheAide() {
        System.out.println("M : pour mettre en majuscules");
        System.out.println("m : pour mettre en minuscules");
        System.out.println("C : pour capitaliser les mots");
        System.out.println("n : pour afficher le nombre de caractères");
        System.out.println("w : pour afficher le nombre de mots");
        System.out.println("s : pour compter le nombre d'occurence d'un motif");
        System.out.println("h : pour afficher l'aide");
        System.out.println("Q : pour quitter l'application");
    }

}
