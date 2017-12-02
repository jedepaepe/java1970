package eu.epfc.java1970.lesson10;


import java.util.Scanner;

public class DessinerCarrePositionVariableIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Côté: ");
        int cote = input.nextInt();
        System.out.print("Position x & y: ");
        int posX = input.nextInt();
        int posY = input.nextInt();
        // création d'un chaîne de caractères pour le carré (vue horizontale)
        String line = "";
        // ajouter les espaces
        for(int i = 0; i < (posX + cote) ; i++) {
            if(i < posX) {
                line += " ";
            } else {
                line += "#";                
            }
        }
        // partie impression (verticale)
        // lignes vides
        for(int i = 0; i < posY; i++) {
            System.out.println();
        }
        // lignes "carré"
        for (int i = 0; i < cote; i++) {
            System.out.println(line);
        }
    }
    
}
