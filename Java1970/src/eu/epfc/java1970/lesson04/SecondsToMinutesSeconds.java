package eu.epfc.java1970.lesson04;

import java.util.Scanner;


public class SecondsToMinutesSeconds {
    public static void main(String[] args) {
/*        System.out.println("Ceci est une tableau : \"Ceci n'est pas une pipe\"");
        System.out.println("Voici un backslash \\");
*/        
        Scanner input = new Scanner(System.in);
        System.out.print("Tapez un nombre de secondes: ");
        long totalSecondes = input.nextLong();
        long minutes = totalSecondes / 60;
        long secondes = totalSecondes % 60;
        System.out.println("Le nombre de minutes est " + minutes);
        System.out.println("Le nombre de secondes est " + secondes);
        System.out.println(minutes + "' " + secondes + "\"");
        float f = 9823.273F;
        double d = 9823.273;
        long l = 2147483648L;
    }
}
