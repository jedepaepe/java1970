package eu.epfc.java1970.lesson07;

import java.util.Scanner;

/*
Démo while
 */
public class AireCercles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            double rayon = input.nextDouble();
            System.out.println("L'aire est " + Math.PI * rayon * rayon);
        }
    }    
}
