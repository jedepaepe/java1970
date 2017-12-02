package eu.epfc.java1970.lesson08;

import java.util.Scanner;


public class StringCompare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String readString = input.next();
        if(readString.equals("1")) {
            System.out.println("readString == test " + readString);
        } else {
            System.out.println("readString != test " + readString);
        }
    }
}
