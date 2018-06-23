/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.verbist;


import java.util.Scanner;

public class ExamenJavaSe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase;
        // #prof# manque le do{...}while 

        System.out.println("Ecrivez votre phrase:");

        phrase = input.nextLine();

        System.out.println("Choisissez le traitement à effectuer: ");   // #prof# mieux dans une fonction -1
        System.out.println("M -> Mettre en majuscules");
        System.out.println("m -> Mettre en minuscules");
        System.out.println("C -> mettre en capitalisé");
        System.out.println("n -> compter le nombre de caractères");
        System.out.println("e -> compter le nombre de mot");
        System.out.println("f -> rechercher un mot et donner le nombre");
        System.out.println("g -> afficher l'aide");
        System.out.println("h -> quitter l'application");

        String cmd = input.nextLine();

        switch (cmd) {
            case "M":
                phrase = phrase.toUpperCase();
                System.out.println(phrase);
                break;
            case "m":
                phrase = phrase.toLowerCase();
                System.out.println(phrase);
                break;
            case "C":
                StringBuilder b = new StringBuilder(phrase);
                int i = 0;
                do {
                    b.replace(i, i + 1, b.substring(i, i + 1).toUpperCase());
                    i = b.indexOf(" ", i) + 1;
                } while (i > 0 && i < b.length());

                System.out.println(b.toString());
                break;
            case "n":
                int longueurPhrase = 0; // #prof# assignation inutile -1
                longueurPhrase = phrase.length();
                System.out.println("Votre phrase contient: " + longueurPhrase + " caractère(s)");
                break;
            case "e":
                int word = 0;
                word = phrase.split("\\w+").length - 1; // #prof# pourquoi -1?
                System.out.println("Il y a " + word + " mots dans votre phrase");
                break;
            case "f":
                System.out.println("No Answer");
                break;
            case "g":
                System.out.println("Voici de nouveau la liste: ");  // #prof# mieux dans une fonction -1
                System.out.println("M -> Mettre en majuscules");
                System.out.println("m -> Mettre en minuscules");
                System.out.println("C -> mettre en capitalisé");
                System.out.println("d -> compter le nombre de caractères");
                System.out.println("e -> compter le nombre de mot");
                System.out.println("f -> rechercher un mot et donner le nombre");
                System.out.println("g -> afficher l'aide");
                System.out.println("h -> quitter l'application");
                break;
            case "h":
                System.out.println("Good Bye");
                System.exit(0);
            default:
                System.out.println("Error");
        }

    }

}
