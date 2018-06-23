/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.maury;

import java.util.Scanner;

/**
 *
 * @author 3101etmaury
 */
public class JavaSE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez taper une phrase : ");
        String phrase = input.nextLine();
        // #prof# manque le do{...}while
        System.out.println("Veuillez faire un choix");
        String choix = input.nextLine();
        switch (choix) {
            case "M":
                System.out.println(phrase.toUpperCase());
                break;
            case "m":
                System.out.println(phrase.toLowerCase());
                break;
            case "C":
//                System.out.println(c.charAt(0).toUpperCase);
                break;
            case "n":
                System.out.println(phrase.length());
                break;
            case "w":
                System.out.println((phrase.split(" ").length));
                break;
            case "s":
                System.out.println(" ");
                break;
            case "h":
                System.out.println("M : pour mettre en majuscules");    // #prof# mieux dans une fonction
                System.out.println("m : pour mettre en minuscules");
                System.out.println("C : pour capitaliser les mots");
                System.out.println("n : pour afficher le nombre de caractères");
                System.out.println("w : pour afficher le nombre de mots");
                System.out.println("h : pour afficher le l'aide");
                System.out.println("Q : pour quitter l'application");
                break;
            case "Q":
                input.close();  // #prof# excellent +2
                break;

        }
    }
}
