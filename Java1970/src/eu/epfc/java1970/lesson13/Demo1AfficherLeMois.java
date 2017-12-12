/*
Affiche le nom du mois à partir de son numérfo
*/
package eu.epfc.java1970.lesson13;

import java.util.Scanner;

public class Demo1AfficherLeMois {
    public static void main(String[] args) {
        String[] mois = {
            "janvier",
            "février",
            "mars",
            "avril",
            "mai",
            "juin",
            "juillet",
            "août",
            "septembre",
            "octobre",
            "novembre",
            "décembre"
        };
        Scanner input = new Scanner(System.in);
        System.out.println("Tapez le numéro du mois (1-12)");
        int index = input.nextInt();
        if(index < 1 || index > mois.length) {
            System.out.println("Sorry, votre entrée n'est pas valide, "
                    + "vous devez choisir un numéro de mois entre 1 et 12");
        } else {
            System.out.println(mois[index-1]);
        }
    }
}
