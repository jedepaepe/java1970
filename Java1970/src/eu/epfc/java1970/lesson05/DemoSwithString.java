package eu.epfc.java1970.lesson05;

import java.util.Scanner;


public class DemoSwithString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
        switch(message) {
            case "HELLO":
                System.out.println("Process HELLO message");
                break;
            case "GOODBYE":
                System.out.println("Process GOODBYE message");
                break;
            default:
                System.out.println("Error - message inconnu : " + message);
        }
    }
}
