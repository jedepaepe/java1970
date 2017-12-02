package eu.epfc.java1970.lesson10;


import java.util.Scanner;

public class NombreEspacesCaracteres {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ecrivez une phrase: ");
        String phrase = input.nextLine();
        int nombreEspace = 0;
        for(int i=0; i<phrase.length(); i++) {
            if(phrase.charAt(i) == ' ') {
                nombreEspace++;
            }
        }
        System.out.println("Le texte contient");
        System.out.println(".) " + nombreEspace + " espaces");
        System.out.println(".) " + (phrase.length() - nombreEspace) + " caractères");
    }
}
