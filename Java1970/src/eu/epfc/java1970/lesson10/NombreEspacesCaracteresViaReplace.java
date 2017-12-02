package eu.epfc.java1970.lesson10;


import java.util.Scanner;

public class NombreEspacesCaracteresViaReplace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ecrivez une phrase: ");
        String phrase = input.nextLine();
        String phraseSansEspace = phrase.replaceAll(" ", "");
        int nombreEspace = phrase.length() - phraseSansEspace.length();
        
        System.out.println("Le texte contient");
        System.out.println(".) " + nombreEspace + " espaces");
        System.out.println(".) " + (phrase.length() - nombreEspace) + " caractères");
    }
    
}
