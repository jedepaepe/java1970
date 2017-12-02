package eu.epfc.java1970.lesson05;

import java.util.Scanner;


public class Ex0206SumDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez taper un nombre: ");
        int nombre = input.nextInt();
        if(0 <= nombre && nombre < 1000) { 
            int nrCentaines = nombre / 100;
            int nrUnites = nombre % 10;
            int nrDizaines = (nombre - nrCentaines * 100) / 10;
            int sumChiffres = nrCentaines + nrDizaines + nrUnites;
            System.out.println("La somme des chiffres est : " + sumChiffres);
        } else {
            String message;
            if(nombre < 0) {
                message = "petit";
            } else {
                message = "grand";
            }
            System.out.println("Le nombre est trop " + message + " " + nombre);
        }
        
//        System.out.println(nombre / 100 + (nombre / 10) % 10 + nombre % 10);
    }
}
