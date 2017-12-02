package eu.epfc.java1970.lesson05;

import java.util.Scanner;

public class DemoElseIf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int points = input.nextInt();

        if (points >= 15) {
            System.out.println("B");
        } else if (points >= 10) {
            System.out.println("S");
        } else {
            System.out.println("F");
        }
    }
}
