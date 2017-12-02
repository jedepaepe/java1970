package eu.epfc.java1970.lesson10;


import java.util.Scanner;


public class Menu {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        String choix;
        do {
            System.out.println("Tapez 1 pour section commerciale");
            System.out.println("Tapez 2 pour section comptabilité");
            System.out.println("Tapez Q pour quitter le programme");
            choix = input.next();
            switch(choix) {
                case "1":
                    System.out.println("Section commerciale");
                    break;
                case "2":
                    System.out.println("Section comptabilité");
                    break;
                case "Q":
                    break;
                default:
                    System.out.println(choix + " n'est pas une option du programme");
            }
        } while( ! choix.equals("Q"));
        System.out.println("A bientôt");
    }
}
