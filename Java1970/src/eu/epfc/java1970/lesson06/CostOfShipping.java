package eu.epfc.java1970.lesson06;

import java.util.Scanner;

/*
Exercice 3.18 page 1110
*/
public class CostOfShipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double poids = input.nextDouble();

        if(0 < poids && poids <= 1) {
            System.out.println("Coût du transport €3.50");
        } else if(1 < poids && poids <=3) {
            //...
        }
        
    }
}
