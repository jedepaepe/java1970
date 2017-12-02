package eu.epfc.java1970.lesson08;

import java.util.Scanner;

public class MenuChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choix;
        int compteur = 1;
        do {
            System.out.println("Nr d'exécution : " + compteur);
            compteur++;
            System.out.println("Tapez 1 pour continuer");
            System.out.println("Tapez Q pour quitter");
            choix = input.next().charAt(0);
        } while(choix != 'Q');
        System.out.println("Goodbye");
    }
    
}
