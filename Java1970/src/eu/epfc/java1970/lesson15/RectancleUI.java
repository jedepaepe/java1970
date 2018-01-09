package eu.epfc.java1970.lesson15;

import java.util.Scanner;

/**
 * classe qui gère l'interface utilisateur (UI : User Interface), en mode console
 * pour le calcul de l'aire et du périmètre d'un rectangle
 */
public class RectancleUI {
    
    /**
     * point d'entrée du programme
     * invite l'utilisateur à introduire la hauteur et la largeur du Rectangle
     * et retourne l'aire et le périmètre
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // crée un objet de type Scanner connecté au clavier (System.in)
        Rectangle rect = new Rectangle();           // crée un nouveau Rectangle
        System.out.print("Hauteur: ");              // demande la hauteur à l'utilisateur
        rect.height = input.nextDouble();           // sauve la saisie de l'utilisateur dans l'objet rect
        System.out.print("Largeur: ");              // demande la largeur à l'utilisateur
        rect.width = input.nextDouble();            // sauve la saisie de l'utilisateur dans l'objet rect
        System.out.println("Aire: " + rect.getArea());  // affiche l'aire
        System.out.println("Perimetre: " + rect.getPerimeter());    // affiche le périmètre
    }
}
