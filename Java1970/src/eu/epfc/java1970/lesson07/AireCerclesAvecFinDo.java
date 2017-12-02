package eu.epfc.java1970.lesson07;

import java.util.Scanner;

/*
Démo while
 */
public class AireCerclesAvecFinDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rayon = input.nextDouble();
        do {
            System.out.println("L'aire est " + Math.PI * rayon * rayon);
            rayon = input.nextDouble();
        } while(rayon > 0);
        System.out.println("A bientôt");
    }    
}
