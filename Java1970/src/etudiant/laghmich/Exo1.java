/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.laghmich;


import java.util.Scanner;

public class Exo1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String phrase = "";     // #prof# assignation non nécessaire -1

        // #prof# manque la boucle do{...} while
        System.out.println("Veuillez saisir votre phrase:");

        phrase = input.nextLine();

        System.out.println("Choisissez le traitement à effectuer: ");   // #prof# à mettre dans une fonction -1
        System.out.println("a -> Mettre en majuscules");
        System.out.println("b -> Mettre en minuscules");
        System.out.println("c -> mettre en capitalisé");
        System.out.println("d -> compter le nombre de caractères");
        System.out.println("e -> compter le nombre de mot");
        System.out.println("f -> rechercher un mot et donner le nombre");
        System.out.println("g -> afficher l'aide");
        System.out.println("h -> quitter l'application");

        String cmd = input.nextLine();

        switch (cmd) {
            case "a":   // #prof# commentaire serait bien venu
                UpperCase(phrase);
                break;
            case "b":
                LowerCase(phrase);
                break;
            case "c":
                Capital(phrase);
                break;
            case "d":
                CountCaracts(phrase);
                break;
            case "e":
                CountWords(phrase);
                break;
            case "f":
                System.out.println("je ne sais pas :-("); // #prof# +2 pour le fun
                break;
            case "g":
                Help();
                break;
            case "h":
                ExitApp();
                break;
            default:
                System.out.println("La commande que vous avez tapée n'est pas supportée");
        }

    }

    public static void UpperCase(String phrase) {   // #prof# non respect du camelCase -1

        phrase = phrase.toUpperCase();
        System.out.println(phrase);
    }

    public static void LowerCase(String phrase) {   // #prof# non respect du camelCase -1
        phrase = phrase.toLowerCase();
        System.out.println(phrase);
    }

    public static void Capital(String phrase) {   // #prof# non respect du camelCase -1
        StringBuilder b = new StringBuilder(phrase);
        int i = 0;
        do {
            b.replace(i, i + 1, b.substring(i, i + 1).toUpperCase());
            i = b.indexOf(" ", i) + 1;
        } while (i > 0 && i < b.length());

        System.out.println(b.toString());
    }

    public static void CountCaracts(String phrase) {   // #prof# non respect du camelCase -1
        int longueurPhrase = 0;
        longueurPhrase = phrase.length();
        System.out.println("Votre phrase contient: " + longueurPhrase + " caractère(s)");
    }

    public static void CountWords(String phrase) {   // #prof# non respect du camelCase -1
        int word = 0;
        word = phrase.split("\\w+").length - 1;     // #excellent# sauf le -1
        System.out.println("Il y a " + word + " mots dans votre phrase");
    }

    public static void Help() {   // #prof# non respect du camelCase -1
        System.out.println("Voici de nouveau la liste: ");
        System.out.println("a -> Mettre en majuscules");
        System.out.println("b -> Mettre en minuscules");
        System.out.println("c -> mettre en capitalisé");
        System.out.println("d -> compter le nombre de caractères");
        System.out.println("e -> compter le nombre de mot");
        System.out.println("f -> rechercher un mot et donner le nombre");
        System.out.println("g -> afficher l'aide");
        System.out.println("h -> quitter l'application");
    }

    public static void ExitApp() {   // #prof# non respect du camelCase -1
        System.out.println("A la prochaine :-)");
        System.exit(0);
    }
}
