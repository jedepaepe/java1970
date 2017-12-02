package eu.epfc.java1970.lesson06;

import java.util.Scanner;

/**
 *
 * @author adnan
 */
public class Correction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight: ");
        double weight = input.nextDouble();

        if(weight <= 0) {
            System.out.println("Please, introduce a correct weight");
        } else if(weight <= 1) {
            System.out.println("The cost of the package of weight " + weight + "is $3.5");
        } else if (weight <= 3) {
            System.out.println("The cost of the package of weight " + weight + "is $5.5");
        } else if (weight <= 10) {
            System.out.println("The cost of the package of weight " + weight + "is $8.5");
        } else if (weight <= 20) {
            System.out.println("The cost of the package of weight " + weight + " is $10.5");
        } else {
            System.out.println("This is untransportable, too heavy");
        }

    }

}
