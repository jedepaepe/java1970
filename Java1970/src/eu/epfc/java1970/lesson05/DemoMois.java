package eu.epfc.java1970.lesson05;

import java.util.Scanner;

public class DemoMois {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mois = input.nextInt();
        
        if(mois == 1) {
            System.out.println("Janvier");
        } else if(mois == 2) {
            System.out.println("Février");
        } else if(mois == 3) {
            System.out.println("Mars");
        }   // ...
    }
}
