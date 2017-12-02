package eu.epfc.java1970.lesson08;

import java.util.Scanner;

public class MenuLocationVoitures {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choix;
        do {
            System.out.println("Tapez 1 pour lister les voitures");
            System.out.println("Tapez 2 pour une location");
            System.out.println("Tapez 3 pour un retour");
            System.out.println("Tapez Q pour Quitter");
            choix = input.next().toUpperCase(); // indépendant de la case (q => quitter)
            switch ( choix ) {
                case "1":
                    displayCarList();
                    break;
                case "2":
                    manageLocationForm();
                    break;
                case "3":
                    manageReturnForm();
                    break;
                case "Q":
                    break;  // éviter le default
                default:
                    System.out.println("Choix incorrect, seuls 1, 2, 3 et Q sont permis");
            }
        } while (!choix.equals("Q"));
        System.out.println("Goodbye");
    }

    public static void manageReturnForm() {
        // manageReturnForm()
        System.out.println("Formulaire retour (simulation)");
    }

    public static void manageLocationForm() {
        // manageLocationForm()
        System.out.println("Formulaire location (simulation)");
    }

    public static int randomDigit() {
        int digit = (int) (Math.random() * 10);
        return digit;
    }

    public static String generateCarIdentifier() {
        // car identifier est composé de 3 caractères 0-9
        int d1 = randomDigit();
        int d2 = randomDigit();
        int d3 = randomDigit();
        return "" + d1 + d2 + d3;
    }
    
    public static String generateCarIdentifier(int nrChar) {
        // String[] args = new String[0];
        // main(args);
        // car identifier est composé de nrChar caractères 0-9
        int d1 = randomDigit();
        int d2 = randomDigit();
        int d3 = randomDigit();
        return "" + d1 + d2 + d3;
    }

    // afficher 30 voitures Ferrari + numéro identification 
    // sur une chaîne de caractères de 3 chiffres <= random
    public static void displayCarList() {
        System.out.println("Liste des voitures (simulation)");
        for (int i = 0; i < 30; i++) {
            System.out.println("Ferrari " + generateCarIdentifier(3));
        }
    }

}
