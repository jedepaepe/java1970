package eu.epfc.java1970.lesson03;

import java.util.Scanner;

public class DecouverteClavier {

    public static void main(String[] args) {
        final double PI = 3.1415927;
        Scanner clavier;    // déclaration d'une variable "clavier" de type "Scanner"
        clavier = new Scanner(System.in);
        double rayon;
        System.out.print("Veuillez introduire un rayon:  ");
        rayon = clavier.nextDouble();
        System.out.println("Vous avez demandé l'aire d'un cercle de rayon " 
                + rayon);
        double perimetre = 2 * PI * rayon;
        System.out.println("Le périmètre est " + perimetre);
        double aire = PI * rayon * rayon;
        System.out.println("L'aire est " + aire);
        
    }
}
