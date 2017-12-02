package eu.epfc.java1970.lesson05;

import java.util.Scanner;


public class DemoMoisSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mois = input.nextInt();
        
        switch(mois) {
            case 1:
                System.out.println("Janvier");
                break;
            case 2:
                System.out.println("Février");
                break;
            case 3:
                System.out.println("Mars");
                break;
            case 4:
                System.out.println("Avril");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Juin ou Juillet ou Août");
                break;
            default:
                System.out.println("Entrée incorrecte");
        }
    }
}




