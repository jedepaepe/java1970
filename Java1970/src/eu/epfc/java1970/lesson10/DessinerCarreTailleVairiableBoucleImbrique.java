package eu.epfc.java1970.lesson10;


import java.util.Scanner;

public class DessinerCarreTailleVairiableBoucleImbrique {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Côté: ");
        int cote = input.nextInt();
        for (int i = 0; i < cote; i++) { // parcours verticale (ligne)
            for (int j = 0; j < cote; j++) { // parcours horizontal (colonne)
                System.out.print("#");
            }
            System.out.println(); // forcer le saut de ligne
        }
    }
}
