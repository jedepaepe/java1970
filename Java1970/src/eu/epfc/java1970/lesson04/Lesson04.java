package eu.epfc.java1970.lesson04;

import java.util.Scanner;

public class Lesson04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez taper la température en degrés Celsius: ");
        double celsius = input.nextDouble();
        double farenheit = 9.0 / 5 * celsius + 32;
        System.out.println("La température est de " + farenheit + " degrés Farenheit");
        
        System.out.print("Veuillez taper un deuxième température en degrés Celsius: ");
        System.out.println("La température est de " + (9.0 / 5 * input.nextDouble() + 32) + " degrés Farenheit");
     
        long unNombre = input.nextLong();
        System.out.println(unNombre);
    }
}
