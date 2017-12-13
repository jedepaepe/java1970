/*
Affiche une ligne construite à partir de segment de caractères
(simulation de dessins à une dimension)
Objectif :
1) apprendre les tableaux (array)
2) apprendre à structurer un programme avec les fonctions
 */
package eu.epfc.java1970.lesson12;

import java.util.Scanner;

public class LineMaker {

    public static void main(String[] args) {
        char[] ligne = fabriqueTableauCaracteres(' ', 80);
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Tapez:");
            System.out.println("A : pour ajouter un segment");
            System.out.println("D : pour dessiner la ligne");
            System.out.println("Q : pour quitter");
            String choix = input.next().toUpperCase();
            switch(choix) {
                case "A":
                    ajouteLigne(ligne, input);
                    break;
                case "D":
                    dessineLigne(ligne);
                    break;
                case "Q":
                    flag = false;
                    break;
                default:
                    System.out.println("Votre choix " + choix + " n'est pas reconnu par le programme");
                    System.out.println("Veuillez recommencer\n");
            }
        } while(flag);
        input.close();
        System.out.println("See you soon");
    }

    /**
     * Crée et retourne un tableau de caractères
     * @param init le caractère d'initialisation
     * @param size la taille du tableau
     * @return un tableau de caractères de taille "size" initialisé avec le "init"
     */
    private static char[] fabriqueTableauCaracteres(char init, int size) {
        char[] charArray = new char[size];
        for (char c : charArray) {
            c = init;
        }
        return charArray;
    }

    /**
     * Ajoute un segment à la ligne
     * @param ligne la ligne à laquelle le segment est ajouté
     * @param input une instance de Scanner pour introduire les input
     */
    private static void ajouteLigne(char[] ligne, Scanner input) {
        System.out.println("Introduisez");
        System.out.print("Le caractère du segment: ");
        char c = input.next().charAt(0);
        System.out.print("La position du segment: ");
        int position = nextValidInt(0, ligne.length - 1, input);
        System.out.print("La longueur du segment: ");
        int longueur = nextValidInt(1, ligne.length - position, input);
        for(int i=position; i<position+longueur; i++) {
            ligne[i] = c;
        }
    }

    /**
     * Retourne un entier valide
     * @param min valeur minimum
     * @param max valeur maximum
     * @param input stream d'entrée
     * @return un entier compris entre [min, max]
     */
    private static int nextValidInt(int min, int max, Scanner input) {
        boolean flag;
        int position;
        do {
            position = input.nextInt();
            if(position >= min && position <= max) {
                flag = false;
            } else {
                System.out.println(position + " n'est pas une position valide");
                System.out.println("La position doit être entre + " + min + " et " + max);
                flag = true;
            }
        } while(flag);
        return position;
    }

    /**
     * Dessine la ligne sur l'écran
     * @param ligne 
     */
    private static void dessineLigne(char[] ligne) {
        System.out.println(ligne);
    }
    
}
