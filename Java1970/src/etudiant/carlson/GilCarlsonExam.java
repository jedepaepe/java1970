/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.carlson;


import java.util.Scanner;

/**
 *
 * @author 0504gicarlson
 */
public class GilCarlsonExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String menuText = "\n\tTapez A pour convertir en MAJUSCULES"
                + "\n\tTapez B pour convertir en minuscules"
                + "\n\tTapez C pour Mettre La Première Lettre De Chaque Mot en Majuscules"
                + "\n\tTapez D pour compter le nombre de caractères"
                + "\n\tTapez E pour compter le nombre de mots"
                + "\n\tTapez F pour chercher un motif dans la phrase"
                + "\n\tTapez H pour afficher l'aide"
                + "\n\tTapez Q pour quitter l'application";
        boolean keepGoing = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenue dans l'application de manipulation de Strings. Les choix possibles sont : "
                + menuText);
        System.out.println("Entrez une phrase : ");
        String userSentence = input.nextLine();

        do {
            System.out.println("Vous avez entré : "
                    + "\n\t" + userSentence
                    + "\nEntrez une commande : ");
            String userChoice = input.next();
            switch (userChoice) {
                case "A":
                    System.out.println(userSentence.toUpperCase());
                    break;
                case "B":
                    System.out.println(userSentence.toLowerCase());
                    break;
                case "C":
                    System.out.println(upperCaseAllFirst(userSentence));
                    break;
                case "D":
                    System.out.println("La phrase contient : " + countChars(userSentence) + " caractères. ");
                    break;
                case "E":
                    System.out.println("La phrase contient : " + countWords(userSentence) + " mots. ");
                    break;
                case "F":
                    System.out.println("Entrez le motif à rechercher ");
                    String userPattern = input.next();
                    System.out.println("Le motif apparait " + countPatternFinds(userPattern, userSentence) + " fois dans la phrase. ");
                    break;
                case "H":
                    System.out.println(menuText);
                    break;
                case "Q":
                    System.out.println("Merci et au revoir ");
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Veuillez entrer une commande valide ( H pour afficher l'aide )");
                    break;
            }

        } while (keepGoing);
    }

    public static String upperCaseAllFirst(String value) {

        char[] array = value.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (Character.isWhitespace(array[i - 1])) {
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        return new String(array);
    }

    public static int countChars(String sentence) { // #prof# trop complexe : sentence.length() -1
        int result;
        char[] array = sentence.toCharArray();
        result = array.length;
        return result;
    }

    public static int countWords(String sentence) {
        int result = 0;
        String trim = sentence.trim();  // #prof# excellent +1
        if (trim.isEmpty()) {
            return result;
        }
        result = trim.split("\\s+").length; // #prof# excellent +1
        return result;
    }

    public static int countPatternFinds(String pattern, String sentence) {
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {
            lastIndex = sentence.indexOf(pattern, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += pattern.length();
            }
        }
        return count;
    }
}
