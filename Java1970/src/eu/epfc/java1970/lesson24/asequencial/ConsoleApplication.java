/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.epfc.java1970.lesson24.asequencial;

import java.util.Scanner;

/**
 *
 * @author jedepaepe
 */
public class ConsoleApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean next = true;
        // boucle "infinie"
        while (next) {
            System.out.println("Veuillez entrer votre commande 1 ou 2 ou Q");
            // nextLine est un appel bloquant (synchrone)
            String cmd = scanner.nextLine();    // lisez la "queue de commande" (queue des bytes qui proviennent du clavier)
            switch (cmd) {  // ressemble à un menu
                case "1":
                    System.out.println("Action 1 appelée");
                    break;
                case "2":
                    System.out.println("Action 2 appelée");
                    break;
                case "Q":
                    System.out.println("Quitter");
                    next = false;
                    break;
                default:    // cas d'erreur
                    System.err.println("Commande inconnue: " + cmd);
                    System.err.println("Veuillez taper 1 ou 2 ou Q");
            }
        }
    }
}
