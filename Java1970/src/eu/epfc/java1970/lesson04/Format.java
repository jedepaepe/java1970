package eu.epfc.java1970.lesson04;

import java.util.Scanner;


public class Format {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double d = input.nextDouble();  // 10.7189327
        long partieEntiere = (long) d;  // 10
        long big = (long) (d * 100);      // 1071
        long partieDecimale = big % 100;    // reste division 1071 par 100 => 71
        System.out.println(partieEntiere + "." + partieDecimale);
    }
}
