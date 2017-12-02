package eu.epfc.java1970.lesson08;
        
import java.util.Scanner;

public class AireCerclesAvecFinDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rayon = input.nextDouble();   // saisir le rayon
        do {
            System.out.println("L'aire est " + Math.PI * rayon * rayon);    // affichage de l'aire
            rayon = input.nextDouble();     // saisir le rayon (suivant)
        } while(rayon > 0);                 // tant que le rayon est plus grand que 0, retourner à la ligne "do"
        System.out.println("A bientôt");
    }  
}
