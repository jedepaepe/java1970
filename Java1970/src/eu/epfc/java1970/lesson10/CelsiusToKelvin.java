package eu.epfc.java1970.lesson10;


import java.util.Scanner;

public class CelsiusToKelvin {

    public static void main(String[] args) {
        final double ZERO_ABSOLU = 273.15;  // en degrés Celsius
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez une température en degré celsius: ");
        double celsius = input.nextDouble();
        if (celsius < -ZERO_ABSOLU) {
            System.out.println(celsius + " est une température est impossible");
        } else {
            System.out.println(celsius + " celsius est " + (celsius + ZERO_ABSOLU));
        }
    }
}
