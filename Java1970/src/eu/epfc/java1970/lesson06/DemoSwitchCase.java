package eu.epfc.java1970.lesson06;

import java.util.Scanner;


public class DemoSwitchCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tapez 1 pour calculer l'aire");
        System.out.println("Tapez 2 pour calculer le périmètre");
        System.out.println("Tapez 3 pour quitter");
        int choix = input.nextInt();
        switch(choix) {
            case 1:
                System.out.println("Taper le rayon");
                double rayon = input.nextDouble();
                System.out.println("L'aire est " + Math.PI * rayon * rayon);
                break;
            case 2:
                System.out.println("Taper le rayon");
                rayon = input.nextDouble();
                System.out.println("Le périmètre est " + 2 * Math.PI * rayon);
                break;
            case 3:
                System.out.println("Bye bye");
                break;
            default:
                System.out.println("Mauvaise commande");
        }
    }
}
