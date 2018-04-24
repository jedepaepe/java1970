/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.epfc.java1970.lesson27.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jedepaepe
 */
public class DemoException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean next = true;    // si le calcul n'a pas encore été réalisé
        do {
            System.out.print("Entrez deux entiers: ");
            try {   // (try est un mot clef) essaie d'exécuter le code qui suit
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                System.out.println(number1 + " / " + number2 + " = " + number1 / number2);
                System.out.println("pas d'exception");
                next = false;
            } catch (Throwable ex) {
                //} catch (InputMismatchException | ArithmeticException ex) {   // (catch est un mot clef du language)
                // attrape l'exception (s'il y a une exception)
                // que les exceptions du type ArithmeticException
                System.out.println(ex.toString());
                input.nextLine();   // nétoyer le buffer
            }
        } while (next);
        System.out.println("Terminé, à bientôt");
        input.close();
    }

}
